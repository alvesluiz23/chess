package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board boardgame, Color color) {
        super(boardgame, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
