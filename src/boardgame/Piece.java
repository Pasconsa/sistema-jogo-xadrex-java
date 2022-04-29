package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;            //03.1 As pe�as associa com 1 tabuleiro
	
	
	public Piece(Board board) {    //03.1 construtor pe�a no tabuleiro
		this.board = board;
		position = null; //posi��o da pe�a inicia no zero
	}


	protected Board getBoard() { //03.1 set board foi apagado pois este n�o sera alterado
		return board;          		//protected pois esse tabuleiro � apenas uso camada tabuleiro
	}

//11.1.1 Possible moves abstract 
	public abstract boolean [][] possibleMoves();

//11.1.2
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
//11.1.3
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
