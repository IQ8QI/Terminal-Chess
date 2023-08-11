import java.util.Arrays;
import java.util.List;

public class Board {
    List<Character> columns = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
    List<Integer> rows = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    char[][] board =
    {
        {
            'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'
        },
        {
            'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'
        },
        {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
        },
        {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
        },
        {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
        },
        {
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
        },
        {
            'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'
        },
        {
            'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'
        }
    };
    private String whitePlayer = "Player 1";
    private String blackPlayer = "Player 2";
    private String currentPlayer = "white";

    public Board(String whitePlayer, String blackPlayer){
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
    }

    /**
     * Function attempts to make a move on the board
     * @param move, move written in chess notation
     */
    public void makeMove(String move){
        char movingPiece;
        if(columns.contains(move.charAt(0))){
            movingPiece = 'P';
        } else {
            movingPiece = move.charAt(0);
        }
    }

    /**
     * Function checks if the move is legal
     * @param move, move to be tested
     * @param currentPlayer, player currently playing
     * @return true if move is legal, false if move is illegal
     */
    private boolean isMoveLegal(String move, String currentPlayer){
        return false;
    }
}
