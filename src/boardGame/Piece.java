package boardGame;

public class Piece {
    protected Position position;
    private Board board;


    public Piece(Board boardgame) {
        this.board = boardgame;
        position = null;
    }

    protected  Board getBoard(){
        return  board;
    }

}
