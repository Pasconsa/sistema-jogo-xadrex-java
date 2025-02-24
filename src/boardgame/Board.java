package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[] [] pieces;   //matrizes de pe�as
	
	//03.2 construtor
	public Board(int rows, int columns) {
		if(rows <1 || columns <1) {   // 6.3 aplica��o de exception
			throw new BoardException ("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows] [columns];  //03.2 matriz de pe�as ser� instanciada com piece na quntidade
												//coluna e linha informada
	}


	
	
	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

	
	
	//04.1 Construtor = retornando objeto Piece e o nome � piece que recebe row e column.
			//retorna matriz pieces em row column
	public Piece piece (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException ("Position not on the board"); //06.3 exception se esse posi��o n�o existir no tabuleiro
		}
		return pieces[row][column];
	}
	
	//06.3
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException ("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//05.1 esse metodo , pega matriz na posi��o dada e coloca e a pe�ar atribuida.
	//06.3 exce��o se existir pe�a ja na posi��o.
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
//09.1 metodo removepiece ; lancar uma excess�o caso n�o exista
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException ("Position not on the board");
		}
		if (piece(position) == null) { //se a pe�a estiver em um lugar nulo retorne nulo
			return null;
		} 
		Piece aux = piece(position);       //sen�o acontecer retirar a pe�a do tabuleiro
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null; // na matriz  da pe�a onde removo a pe�a vai ser nulo n�o tem mais pe�a
		return aux;
	}
		
		
		
	//06.2
		//condi��es completas para ver se aposi��o existe
			
	private boolean positionExists(int row , int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	//06.2 Implementar thereis a piece, teste se tem uma pe�a nesta posi��o.
		//06.3 testando se a posi��o existe
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) !=null;
	}
	
	
}
