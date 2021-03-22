package tictactoe.Controllers;

import tictactoe.Models.EGameState;
import tictactoe.Views.OutputView;

public class OutputController {

    public static void Display(String s) { OutputView.Display(s); }
    public static void DrawInitialBoard(String StringCells) {
        Display("---------\n");
        for (int i = 0; i < 3; i++) {
            Display("| ");

            for (int j = 3 * i; j < 3 * i + 3; j++) {
                Display(StringCells.charAt(j) + " ");
            }

            Display("|\n");
        }
        Display("---------\n");
    }
    public static void DrawBoard(char[][] board) {
        Display("---------\n");
        for (int i = 0; i < 3; i++) {
            Display("| ");

            for (int j = 0; j < 3; j++) {
                Display(board[i][j] + " ");
            }

            Display("|\n");
        }
        Display("---------\n");
    }

}
