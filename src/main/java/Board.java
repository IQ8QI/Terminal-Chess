import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private final List<Character> columns = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
    private final List<Integer> rows = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    private final List<Character> legalPieces = Arrays.asList('R', 'N', 'B', 'Q', 'K', 'P');
    private List<String> moveOrder = new ArrayList<>();
    String [][] board =
    {
        {
            "BR", "BN", "BB", "BQ", "BK", "BB", "BN", "BR"
        },
        {
            "BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"
        },
        {
            " ", " ", " ", " ", " ", " ", " ", " "
        },
        {
            " ", " ", " ", " ", " ", " ", " ", " "
        },
        {
            " ", " ", " ", " ", " ", " ", " ", " "
        },
        {
            " ", " ", " ", " ", " ", " ", " ", " "
        },
        {
            "WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"
        },
        {
            "WR", "WN", "WB", "WQ", "WK", "WB", "WN", "WR"
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

    public String[][] getBoard(){
        return this.board;
    }
}
