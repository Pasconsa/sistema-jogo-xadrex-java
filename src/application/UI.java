package application;

import chess.ChessPiece;

public class UI {
	
/*Imprimindo o tabuleiro
 * fazer 2 for um percorre as linhas e outr as colunas */
	
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8-i) + " ");      //imprimir na tabela 8 a 1 linhas
			for (int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);        //colocar a pe�a na posi��o i e j
			}
			System.out.println();  //quebra linha do tabuleiro
		}
		System.out.println("  a b c d e f g h");  //imprimindo as colunas
	}
	
	
	/* 04 Metodo auxliar para imprimir uma unica pe�a   
	        -printpiece rebendo uma chessprice 
	        -se a pe�a for igual a nulo quer dizer n�o tem pe�a -
	        -caso contrario imprimo pe�a
	        - espa�o em branco pe�as nao colarem */
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
