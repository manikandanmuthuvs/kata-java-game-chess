package com.manikandanmuthuvs.game.chess.contract.usecase;

import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.domain.Spot;

public interface PieceMoveHorizontalContract {
	public String moveableSpotInHorizontalRight(ChessBoard chessBoard, Spot fromCurrentSpot);
	public String moveableSpotInHorizontalLeft(ChessBoard chessBoard, Spot fromCurrentSpot);
}
