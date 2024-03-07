package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board boardgame, Color color) {
        super(boardgame, color);
    }


    @Override
    public String toString(){
        return "R";
    }
}
