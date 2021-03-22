package tictactoe.Controllers;

import tictactoe.Models.EPlayers;

public class MainController {

    public static void Start(){
        char[][] board = SetUpTheGame();
        SetCurrentPlayer(board);
        UpdateTheGame();
        GameStateController.CheckGameState();
        GameStateController.DisplayGameState();
    }

    private static char[][] SetUpTheGame() {
        /*char[][] board = InputController.GetBoardValues();
        BoardController.SaveBoard(board);*/
        String StringInput = InputController.GetStringInput();
        StringInput = InputController.CheckStringCompletion(StringInput);
        OutputController.DrawInitialBoard(StringInput);

        char[][] board = InputController.ConvertStringToArray(StringInput);
        BoardController.SaveBoard(board);
        return board;
    }
    private static void SetCurrentPlayer(char[][] board){ PlayerTurnController.SetCurrentPlayer(board);}
    private static void UpdateTheGame(){
        int[] crd = InputController.WhileInvalidInput_GetNextMove();
        char c = PlayerTurnController.GetCurrentPlayer() == EPlayers.O ? 'O' : 'X';
        BoardController.AddPlayerMove(crd, c);
        OutputController.DrawBoard(BoardController.GetBoard());
    }
}