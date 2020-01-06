package com.manikandanmuthuvs.game.chess.contract.usecase;

import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.domain.Spot;

public interface PieceMoveVerticalDownContract {
	public String moveableSpotInVerticalDown(ChessBoard chessBoard, Spot fromCurrentSpot);
}

