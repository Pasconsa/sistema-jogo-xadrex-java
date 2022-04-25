package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}


	public Color getColor() { //n�o gerado set para cor n�o ser alterada
		return color;
	}

//12.1 se existe uma pe�a adversaria na posi��o
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null  &&  p.getColor() != color;
	}
	
	
}
