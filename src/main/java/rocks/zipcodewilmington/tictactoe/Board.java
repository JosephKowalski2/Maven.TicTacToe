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

        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[0][1] == 'X' && tictactoeBoard[0][2] == 'X')
            return true;
        if (tictactoeBoard[1][0] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[1][2] == 'X')
            return true;
        if (tictactoeBoard[2][0] == 'X' && tictactoeBoard[2][1] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[1][0] == 'X' && tictactoeBoard[2][0] == 'X')
            return true;
        if (tictactoeBoard[0][1] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[1][2] == 'X')
            return true;
        if (tictactoeBoard[0][2] == 'X' && tictactoeBoard[2][2] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        if (tictactoeBoard[0][0] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[2][2] == 'X')
            return true;
        if (tictactoeBoard[0][2] == 'X' && tictactoeBoard[1][1] == 'X' && tictactoeBoard[2][0] == 'X')
            return true;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
