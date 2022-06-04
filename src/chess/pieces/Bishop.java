//21.1 pe�a bispo muito parecida com a torre.

package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	//construtor 
	public Bishop(Board board, Color color) {
		super(board, color);
	}

	//R vai ser a pe�a torre
	@Override
	public String toString() {
		return "B" ;
	}

	// automatic
			//tpdas posi��es do rei s�o falsos
		@Override
		public boolean[][] possibleMoves() {
			boolean[][] mat= new boolean[getBoard().getRows()][getBoard().getColumns()];
		//movimentos da torre acima da pe�a
			Position p = new Position(0,0);
			
			//noroeste
			p.setValues(position.getRow() - 1, position.getColumn() -1);
			while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
				p.setValues(p.getRow() - 1, p.getColumn() - 1);
			}
			if (getBoard().positionExists(p)  &&  isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
			}
			
			//nordeste
			p.setValues(position.getRow()-1, position.getColumn() + 1);
			while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
				p.setValues(p.getRow() - 1, p.getColumn() + 1);
			}
			if (getBoard().positionExists(p)  &&  isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
			}
			
			// sudeste
			p.setValues(position.getRow() +1 , position.getColumn() + 1);
			while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
				p.setValues(p.getRow() + 1, p.getColumn() + 1);
			}
			if (getBoard().positionExists(p)  &&  isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
			}

			//sudoeste
			p.setValues(position.getRow() + 1, position.getColumn() -1 );
			while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
				p.setValues(p.getRow() + 1, p.getColumn() - 1);
			}
			if (getBoard().positionExists(p)  &&  isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true ;
			}

			
			return mat;
		}
	
	
	
}
