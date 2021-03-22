package tictactoe.Controllers;

import tictactoe.Views.InputView;

public class InputController {
    private static int[] inputCell = {0, 0};

    public static String GetStringInput(){ return InputView.GetStringInput(); }
    public static char[][] GetBoardValues(){
        String StringInput;
        char[][] BoardValues = new char[3][3];

        StringInput = GetStringInput();
        StringInput = CheckStringCompletion(StringInput);
        return ConvertStringToArray(StringInput);
    }
    public static String CheckStringCompletion(String StringCells) {
        if (StringCells.length() < 9) {
            for(int i = StringCells.length(); i < 9; i++) {
                StringCells = StringCells.concat("_");
            }
        }
        return StringCells;
    }
    public static char[][] ConvertStringToArray(String StringInput) {
        char[][] Board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Board[i][j] = StringInput.charAt(i*3 + j);
            }
        }
        return Board;
    }
    public static int[] WhileInvalidInput_GetNextMove() {
        boolean validInput = false;
        while (!validInput) {
            validInput = GetNextMove();
        }
        return inputCell;
    }

    private static boolean GetNextMove(){
        boolean correctInput = Try_GetCorrectInput();
        boolean cellExist    = Try_CheckCellExist(correctInput);
        boolean cellIsEmpty  = Try_CheckCellIsEmpty(cellExist);

        return correctInput && cellExist && cellIsEmpty;
    }

    private static boolean Try_GetCorrectInput(){
        try {
             GetCorrectInput( GetStringInput());
        }catch (NumberFormatException e) {
            OutputController.Display("You should enter numbers!\n");
            return false;
        }catch (ArrayIndexOutOfBoundsException e) {
            OutputController.Display("Enter the numbers in the same line, separated by a space!\n");
            return false;
        }
        return true;
    }
    private static void GetCorrectInput(String InputString)
            throws NumberFormatException, ArrayIndexOutOfBoundsException{
        String[] pieces = InputString.trim().split(" ");
        inputCell[0] = Integer.parseInt(pieces[0]) - 1;
        inputCell[1] = Integer.parseInt(pieces[1]) - 1;
    }

    private static boolean Try_CheckCellExist(boolean correctInput){
        try {
            if (!correctInput) return false;
            CheckCellExist();
        } catch (CellOutOfBoardException e){
            OutputController.Display(e.getMessage());
            return false;
        }
        return true;
    }
    private static void CheckCellExist() throws CellOutOfBoardException{
        for (int i = 0; i < 2; i++){
            if (inputCell[i] != 0 && inputCell[i] != 1 && inputCell[i] != 2) {
                throw new CellOutOfBoardException("Coordinates should be from 1 to 3!\n");
            }
        }
    }

    private static boolean Try_CheckCellIsEmpty(boolean cellExist){
        try {
            if (!cellExist) return false;
            CheckCellIsEmpty();
        } catch (CellIsNotEmptyException e){
            OutputController.Display(e.getMessage());
            return false;
        }
        return true;
    }
    private static void CheckCellIsEmpty() throws CellIsNotEmptyException {
        if (BoardController.CellIsNotEmpty(inputCell[0], inputCell[1]))
            throw new CellIsNotEmptyException("This cell is occupied! Choose another one!\n");
    }

    static class CellOutOfBoardException extends Exception{ CellOutOfBoardException(String s){ super(s);}}
    static class CellIsNotEmptyException extends Exception{ CellIsNotEmptyException(String s){ super(s);}}
}
