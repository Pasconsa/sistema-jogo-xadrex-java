package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
//04 intanciar uma partida e imprimir o tabuleiro
		//UI.printboard recebe a matriz de pe�as da partida
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
 