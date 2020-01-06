package com.manikandanmuthuvs.game.chess.domain;

import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveHorizontalContract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class King {
	private String currentfSpot;
	private String[] moveableSpots;
	private int ROW_MIN_POSITION = 0;
	private int ROW_MAX_POSITION = 7;
	private int COLUMN_MIN_POSITION = 0;
	private int COLUMN_MAX_POSITION = 7;
	
	
//	
//	public boolean canMoveDiagonalDownLeft(int row, int column) {
//		return (row != ROW_MIN_POSITION && column != COLUMN_MIN_POSITION);
//	}
//	public String moveDiagonalDownLeft(String[][] chessBoard, int row, int column) {
//		return chessBoard[row-1][column-1];
//	}
//	public boolean canMoveDiagonalDownRight(int row, int column) {
//		return(row != ROW_MIN_POSITION && column != COLUMN_MAX_POSITION);
//	}
//	public String moveDiagonalDownRight(String[][] chessBoard, int row, int column) {
//		return chessBoard[row-1][column+1];
//	}
//	
//	
//	public boolean canMoveDiagonalUpLeft(int row, int column) {
//		return (row != ROW_MAX_POSITION && column != COLUMN_MIN_POSITION);		
//	}
//	public String moveDiagonalUpLeft(String[][] chessBoard, int row, int column) {
//		return chessBoard[row+1][column-1];
//	}
//	public boolean canMoveDiagonalUpRight(int row, int column) {
//		if(row != ROW_MAX_POSITION && column != COLUMN_MAX_POSITION) return true;
//		return false;
//	}
//	public String moveDiagonalUpRight(String[][] chessBoard, int row, int column) {
//		return chessBoard[row+1][column+1];
//	}
//	


	public String moveableSpotInHorizontalRight(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionY != COLUMN_MAX_POSITION) ? chessBoard.getSpots()[fromCurrentSpot.positionX][fromCurrentSpot.positionY+1] : "";		
	}
	public String moveableSpotInHorizontalLeft(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionY != COLUMN_MIN_POSITION) ? chessBoard.getSpots()[fromCurrentSpot.positionX][fromCurrentSpot.positionY-1] : "";		
	}
	
	public String moveableSpotInVericalUp(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionY != ROW_MIN_POSITION) ? chessBoard.getSpots()[fromCurrentSpot.positionX + 1][fromCurrentSpot.positionY] : "";		
	}
	public String moveableSpotInVericalDown(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionX != ROW_MIN_POSITION) ? chessBoard.getSpots()[fromCurrentSpot.positionX - 1][fromCurrentSpot.positionY] : "";		
	}
	
	public String moveableSpotInDiagonalUpLeft(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionX != ROW_MAX_POSITION && fromCurrentSpot.positionY != COLUMN_MIN_POSITION) ? 
				chessBoard.getSpots()[fromCurrentSpot.positionX + 1][fromCurrentSpot.positionY - 1] : "";		
	}
	public String moveableSpotInDiagonalUpRight(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionX != ROW_MAX_POSITION && fromCurrentSpot.positionY != COLUMN_MAX_POSITION) ? 
				chessBoard.getSpots()[fromCurrentSpot.positionX + 1][fromCurrentSpot.positionY + 1] : "";			
	}
	
	public String moveableSpotInDiagonalDownLeft(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionX != ROW_MIN_POSITION && fromCurrentSpot.positionY != COLUMN_MIN_POSITION) ? 
				chessBoard.getSpots()[fromCurrentSpot.positionX - 1][fromCurrentSpot.positionY - 1] : "";		
	}
	public String moveableSpotInDiagonalDownRight(ChessBoard chessBoard, Spot fromCurrentSpot) {
		return (fromCurrentSpot.positionX != ROW_MIN_POSITION && fromCurrentSpot.positionY != COLUMN_MAX_POSITION) ? 
				chessBoard.getSpots()[fromCurrentSpot.positionX - 1][fromCurrentSpot.positionY + 1] : "";			
	}
}
