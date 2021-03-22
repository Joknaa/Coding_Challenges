package tictactoe.Controllers;

import tictactoe.Models.EGameState;

public class GameStateController {
    private static EGameState CurrentState = EGameState.Playing;

    public static void CheckGameState(){
        char[][] board = BoardController.GetBoard();
        int[] moves = CountMoves(board);
        int[] wins  = CountWins(board);
        int xMoves = moves[0], xWins = wins[0];
        int oMoves = moves[1], oWins = wins[1];
        int MovesPlayed = xMoves + oMoves;

        if(xWins == 0 && oWins > 0){
            CurrentState = EGameState.O_Win;
        } else if(xWins >  0 && oWins == 0){
            CurrentState = EGameState.X_Win;
        } else if(xWins == 0 && oWins == 0){
            if(MovesPlayed <  9){
                CurrentState = EGameState.Playing;
            } else if (MovesPlayed == 9){
                CurrentState = EGameState.Draw;
            }
        }
    }
    private static int[] CountMoves(char[][] board) { return PlayerTurnController.CountMoves(board); }
    private static int[] CountWins(char[][] board){
        int xWins = 0, oWins = 0;

        for (int i = 0; i < 3; i++) { // Verticals
            xWins += board[i][0] + board[i][1] + board[i][2] == 264 ? 1 : 0;
            oWins += board[i][0] + board[i][1] + board[i][2] == 237 ? 1 : 0;
        }

        for (int i = 0; i < 3; i++) { // Horizontals
            xWins += board[0][i] + board[1][i] + board[2][i] == 264 ? 1 : 0;
            oWins += board[0][i] + board[1][i] + board[2][i] == 237 ? 1 : 0;
        }

        // Diagonals
        xWins += board[0][0] + board[1][1] + board[2][2] == 264 ? 1 : 0;
        oWins += board[0][0] + board[1][1] + board[2][2] == 237 ? 1 : 0;
        xWins += board[0][2] + board[1][1] + board[2][0] == 264 ? 1 : 0;
        oWins += board[0][2] + board[1][1] + board[2][0]  == 237 ? 1 : 0;

        return new int[] {xWins, oWins};
    }
    public static void DisplayGameState(){
        switch (CurrentState) {
            case X_Win: OutputController.Display("X wins\n");
                break;
            case O_Win: OutputController.Display("O wins\n");
                break;
            case Draw: OutputController.Display("Draw\n");
                break;
            case Playing: OutputController.Display("Game not finished\n");
                break;
            case Impossible: OutputController.Display("Impossible\n");
                break;
        }
    }
}
