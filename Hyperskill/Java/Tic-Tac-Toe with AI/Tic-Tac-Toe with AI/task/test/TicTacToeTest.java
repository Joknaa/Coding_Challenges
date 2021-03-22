import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;


public class TicTacToeTest extends StageTest<String> {

    int[] easyAiMoves = new int[9];

    @DynamicTest(order = 1)
    CheckResult testGridOutput() {

        TestedProgram program = new TestedProgram();

        String output = program.start();

        Grid printedGrid = Grid.fromOutput(output);
        Grid emptyGrid = Grid.fromLine("_________");

        if (!printedGrid.equals(emptyGrid)) {
            return CheckResult.wrong("After starting the program you should print an empty grid!\n" +
                "Correct empty grid:\n" + emptyGrid);
        }

        if (!output.toLowerCase().contains("enter the coordinates:")) {
            return CheckResult.wrong("After printing an empty grid you should ask to enter cell coordinates!");
        }

        output = program.execute("2 2");

        Grid gridAfterMove = Grid.fromOutput(output);
        Grid correctGridAfterMove = Grid.fromLine("____X____");

        if (!gridAfterMove.equals(correctGridAfterMove)) {
            return CheckResult.wrong("After making the move wrong grid was printed.\n" +
                "Your grid:\n" + gridAfterMove + "\n" +
                "Correct grid:\n" + correctGridAfterMove);
        }

        if (!output.toLowerCase().contains("making move level \"easy\"")) {
            return CheckResult.wrong("After entering a cell coordinates you should print:\nMaking move level \"easy\"");
        }

        Grid gridAfterAiMove = Grid.fromOutput(output, 2);

        if (gridAfterAiMove.equals(gridAfterMove)) {
            return CheckResult.wrong("After AI move grid wasn't changed!");
        }

        Grid gameGrid = gridAfterAiMove;

        while (true) {
            if (gameGrid.getGameState() != GameState.NOT_FINISHED) {
                switch (gameGrid.getGameState()) {
                    case X_WIN:
                        if (!output.contains("X wins")) {
                            return CheckResult.wrong("You should print 'X wins' if X win the game");
                        }
                        break;
                    case O_WIN:
                        if (!output.contains("O wins")) {
                            return CheckResult.wrong("You should print 'O wins' if O win the game");
                        }
                        break;
                    case DRAW:
                        if (!output.contains("Draw")) {
                            return CheckResult.wrong("You should print 'Draw' if the game ends with draw!");
                        }
                        break;
                }
                break;
            }
            Position nextMove = Minimax.getMove(gameGrid, CellState.X);

            Grid tempGrid = gameGrid.copy();
            tempGrid.setCell(nextMove.x, nextMove.y, CellState.X);

            output = program.execute((nextMove.x + 1) + " " + (nextMove.y + 1));

            gameGrid = Grid.fromOutput(output);

            if (!gameGrid.equals(tempGrid)) {
                return CheckResult.wrong("After making move (" + nextMove + ") the game grid is wrong!\n" +
                    "Your gird\n" + gameGrid + "\n" +
                    "Correct grid\n" + tempGrid);
            }

            if (gameGrid.getGameState() != GameState.NOT_FINISHED)
                continue;

            gameGrid = Grid.fromOutput(output, 2);
        }

        return CheckResult.correct();
    }

    @DynamicTest(repeat = 100, order = 2)
    CheckResult checkEasyAi() {
        TestedProgram program = new TestedProgram();
        program.start();

        String output = program.execute("2 2");

        Grid gridAfterAiMove = Grid.fromOutput(output, 2);

        CellState[][] array = gridAfterAiMove.getGrid();

        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                continue;
            }
            if (array[i / 3][i % 3] == CellState.O) {
                easyAiMoves[i]++;
            }
        }

        return CheckResult.correct();
    }

    @DynamicTest(order = 3)
    CheckResult checkRandom() {
        double averageScore = 0;

        for (int i = 0; i < easyAiMoves.length; i++) {
            averageScore += (i + 1) * easyAiMoves[i];
        }

        averageScore /= 8;

        double expectedValue = (double) (1 + 2 + 3 + 4 + 6 + 7 + 8 + 9) * 100 / 8 / 8;

        if (Math.abs(averageScore - expectedValue) > 20) {
            return CheckResult.wrong("Looks like your Easy level AI doesn't make a random move!");
        }

        return CheckResult.correct();
    }

    boolean isEasyNotMovingLikeMedium = false;

    @DynamicTest(repeat = 30, order = 4)
    CheckResult checkEasyNotMovingLikeMedium() {

        if (isEasyNotMovingLikeMedium) {
            return CheckResult.correct();
        }

        TestedProgram program = new TestedProgram();
        program.start();
        program.execute("start user easy");

        String output = program.execute("2 2");

        Grid gameGrid = Grid.fromOutput(output, 2);

        CellState[][] cellStates = gameGrid.getGrid();

        if (cellStates[0][0] == CellState.EMPTY && cellStates[2][2] == CellState.EMPTY) {
            output = program.execute("1 1");
            gameGrid = Grid.fromOutput(output, 2);
            if (gameGrid.getGrid()[2][2] == CellState.EMPTY) {
                isEasyNotMovingLikeMedium = true;
            }
        } else {
            output = program.execute("1 3");
            gameGrid = Grid.fromOutput(output, 2);
            if (gameGrid.getGrid()[2][0] == CellState.EMPTY) {
                isEasyNotMovingLikeMedium = true;
            }
        }

        program.stop();
        return CheckResult.correct();
    }

    @DynamicTest(order = 5)
    CheckResult checkEasyNotMovingLikeMediumAfter() {
        if (!isEasyNotMovingLikeMedium) {
            return CheckResult.wrong("Looks like your Easy level AI doesn't make a random move!");
        }
        return CheckResult.correct();
    }
}
