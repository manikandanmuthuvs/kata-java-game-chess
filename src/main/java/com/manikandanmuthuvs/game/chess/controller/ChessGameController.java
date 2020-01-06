package com.manikandanmuthuvs.game.chess.controller;

import java.util.ArrayList;
import java.util.Arrays;

import com.manikandan.muthuvs.game.chess.utils.ChessGameUtils;
import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;


public class ChessGameController {
	ChessGameUtils chessGameUtils;
	ChessGameUsecaseImpl chessGameUsecaseImpl;

	public ChessGameController(){
		chessGameUtils = new ChessGameUtils();
		chessGameUsecaseImpl = chessGameUtils.createChessGameUsecase();
	}
	
	public ChessBoard createChessBoard(int ROW_MAX_LENGTH, int COLUMN_MAX_LENGTH, String[] rowName, String[] columeName) {
		return chessGameUsecaseImpl.createChessBoard(ROW_MAX_LENGTH, COLUMN_MAX_LENGTH, rowName, columeName);
	}
	
	public String findAllMoveableSpotsOf(ChessBoard chessBoard, String piece, String fromCurrentSpot) {
		String[] moveableSpots = chessGameUsecaseImpl.findAllMoveableSpotsOf(chessBoard, piece, fromCurrentSpot);
		return Arrays.toString(moveableSpots);
	}
	
}
