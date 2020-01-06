package com.manikandanmuthuvs.game.chess.domain;

import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveVerticalUpContract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pawn implements PieceMoveVerticalUpContract {
	private String currentfSpot;
	private String[] moveableSpots;
	private int ROW_MAX_POSITION = 7;

	public String moveableSpotInVerticalUp(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionY != ROW_MAX_POSITION) ? chessBoard.getSpots()[fromCurrentSpot.positionX + 1][fromCurrentSpot.positionY] : "";		
	}

}
