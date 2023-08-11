public class Board {
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

    public Board(String whitePlayer, String blackPlayer){
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
    }
}
