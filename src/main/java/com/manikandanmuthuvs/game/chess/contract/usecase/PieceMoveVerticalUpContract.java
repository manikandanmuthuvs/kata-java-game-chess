package com.manikandanmuthuvs.game.chess.contract.usecase;

import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.domain.Spot;

public interface PieceMoveVerticalUpContract {
	public String moveableSpotInVerticalUp(ChessBoard chessBoard, Spot fromCurrentSpot);
}

