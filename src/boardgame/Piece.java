package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //posi��o da pe�a inicia no zero
	}


	protected Board getBoard() { //set board foi apagado pois este n�o sera alterado
		return board;          		//protected pois esse tabuleiro � apenas uso camada tabuleiro
	}

	
	
}
