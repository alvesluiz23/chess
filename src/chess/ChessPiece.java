package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board boardgame, Color color) {
        super(boardgame);
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }
}
