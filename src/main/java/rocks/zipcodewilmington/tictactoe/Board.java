package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public  Character [][] tictactoeBoard;

    public Board(Character[][] matrix) {
        tictactoeBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        //horizontal win
        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[0][1] == 'X' && tictactoeBoard[0][2] == 'X')
            return true;
        if (tictactoeBoard[1][0] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[1][2] == 'X')
            return true;
        if (tictactoeBoard[2][0] == 'X' && tictactoeBoard[2][1] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        //vertical win
        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[1][0] == 'X' && tictactoeBoard[2][0] == 'X')
            return true;
        if (tictactoeBoard[0][1] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[1][2] == 'X')
            return true;
        if (tictactoeBoard[0][2] == 'X' && tictactoeBoard[1][2] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        //diagonal win
        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        if (tictactoeBoard[0][2] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[2][0] == 'X')
            return true;
    }

    public Boolean isInFavorOfO() {
        //horizontal win
        if (tictactoeBoard[0][0] == 'O' && tictactoeBoard[0][1] == 'O' && tictactoeBoard[0][2] == 'O')
            return true;
        if (tictactoeBoard[1][0] == 'O' && tictactoeBoard[1][1] == 'O' && tictactoeBoard[1][2] == 'O')
            return true;
        if (tictactoeBoard[2][0] == 'O' && tictactoeBoard[2][1] == 'O' && tictactoeBoard[2][2] == 'O')
            return true;
        //vertical win
        if (tictactoeBoard[0][0] == 'O' && tictactoeBoard[1][0] == 'O' && tictactoeBoard[2][0] == 'O')
            return true;
        if (tictactoeBoard[0][1] == 'O' && tictactoeBoard[1][1] == 'O' && tictactoeBoard[1][2] == 'O')
            return true;
        if (tictactoeBoard[0][2] == 'O' && tictactoeBoard[1][2] == 'O' && tictactoeBoard[2][2] == 'O')
            return true;
        //diagonal win
        if (tictactoeBoard[0][0] == 'O' && tictactoeBoard[1][1] == 'O' && tictactoeBoard[2][2] == 'O')
            return true;
        if (tictactoeBoard[0][2] == 'O' && tictactoeBoard[1][1] == 'O' && tictactoeBoard[2][0] == 'O')
            return true;
    }

    public Boolean isTie() {
        if (isInFavorOfX() || isInFavorOfO())
            return false;
        else
            return true;
    }

    public String getWinner() {
        if (isInFavorOfX())
            return "X";
        else if (isInFavorOfO())
            return "O";

    }
}
