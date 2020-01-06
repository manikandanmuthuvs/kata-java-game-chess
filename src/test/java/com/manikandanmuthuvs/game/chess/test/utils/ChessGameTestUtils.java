package com.manikandanmuthuvs.game.chess.test.utils;

import java.util.ArrayList;

public class ChessGameTestUtils {
	
	public ChessGameTestUtils() {		
	}
	
	public ChessGameUsecaseImpl createChessGameUsecase() {
		ChessGameUsecaseImpl chessGameUsecaseImpl = ChessGameUsecaseImpl.builder()				
				.build();
		return chessGameUsecaseImpl;
	}
}
