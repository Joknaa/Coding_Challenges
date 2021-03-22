package tictactoe.Models;

public class BoardModel {
    private static char[][] Board;

    public static void SetCellValue(int i, int j, char c) { Board[i][j] = c; }
    public static char GetCellValue(int i, int j){ return Board[i][j]; }

    public static void SetBoard(char[][] board){ Board = board; }
    public static char[][] GetBoard(){ return Board; }

    public static boolean CellIsNotEmpty(int i, int j){ return Board[i][j] != '_';}

}
