package com.manikandanmuthuvs.game.chess.contract.usecase;

import java.util.ArrayList;

import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.domain.Spot;


public interface ChessGameUsecaseContract {
	public ChessBoard createChessBoard(int ROW_MAX_LENGTH, int COLUMN_MAX_LENGTH,
			String[] rowName, String[] columeName);
	public String[] findAllMoveableSpotsOf(ChessBoard chessBoard, String piece, String currentSpotName);
}
