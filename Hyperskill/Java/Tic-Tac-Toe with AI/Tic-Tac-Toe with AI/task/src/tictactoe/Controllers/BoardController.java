package tictactoe.Controllers;

import tictactoe.Models.BoardModel;

public class BoardController {

    public static void SaveBoard(char[][] board){ BoardModel.SetBoard(board); }
    public static char[][] GetBoard(){ return BoardModel.GetBoard(); }

    public static void AddPlayerMove(int[] crd, char player) { BoardModel.SetCellValue(crd[0], crd[1], player); }

    public static boolean CellIsNotEmpty(int i, int j){ return BoardModel.CellIsNotEmpty(i, j);}


}
