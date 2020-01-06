package com.manikandanmuthuvs.game.chess.test.utils;

import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveVerticalUpContract;
import com.manikandanmuthuvs.game.chess.domain.King;
import com.manikandanmuthuvs.game.chess.domain.Pawn;
import com.manikandanmuthuvs.game.chess.domain.Queen;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;

public class ChessGameTestUtils {
	PieceMoveVerticalUpContract pawn = new Pawn();
	King king = new King();
	Queen queen = new Queen();
	
	public ChessGameTestUtils() {		
	}
	
	public ChessGameUsecaseImpl createChessGameUsecase() {
		ChessGameUsecaseImpl chessGameUsecaseImpl = ChessGameUsecaseImpl.builder()
				.pawn(pawn)
				.king(king)
				.queen(queen)
				.build();
		return chessGameUsecaseImpl;
	}
}
