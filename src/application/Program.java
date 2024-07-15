package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        System.out.println();

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
