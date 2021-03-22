package tictactoe.Controllers;

import tictactoe.Models.EPlayers;

public class PlayerTurnController {
    private static EPlayers CurrentPlayer = EPlayers.X;
    private static int Turns = 0;
    private static int xMoves = 0;
    private static int oMoves = 0;

    public static EPlayers GetCurrentPlayer(){ return CurrentPlayer; }
    public static void SetCurrentPlayer(char[][] board){
        int[] moves = CountMoves(board);
        xMoves = moves[0];
        oMoves = moves[1];
        CurrentPlayer = xMoves > oMoves ? EPlayers.O : EPlayers.X;
    }

    public static int[] CountMoves(char[][] board) {
        int xMoves = 0;
        int oMoves = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xMoves += board[i][j] == 'X' ? 1 : 0;
                oMoves += board[i][j] == 'O' ? 1 : 0;
            }
        }
        return new int[] {xMoves, oMoves};
    }
    public static void SetTurns(){
        CurrentPlayer = Turns % 2 == 0 ? EPlayers.X : EPlayers.O;
        Turns++;
    }
}
