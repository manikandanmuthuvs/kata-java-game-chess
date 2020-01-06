package com.manikandanmuthuvs.game.chess.test.utils;

import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveVerticalUpContract;
import com.manikandanmuthuvs.game.chess.domain.Pawn;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;

public class ChessGameTestUtils {
	PieceMoveVerticalUpContract pawn = new Pawn();
	public ChessGameTestUtils() {		
	}
	
	public ChessGameUsecaseImpl createChessGameUsecase() {
		ChessGameUsecaseImpl chessGameUsecaseImpl = ChessGameUsecaseImpl.builder()
				.pawn(pawn)
				.build();
		return chessGameUsecaseImpl;
	}
}
