package com.manikandanmuthuvs.game.chess.domain;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Horse {
	private String currentfSpot;
	private String[] moveableSpots;
	

	
	public boolean canMoveVerticalUpAndHorizontalRight(int row, int column) {
		if(row < 5 && column != 7) return true;
		return false;
	}
	public String moveVerticalUpAndHorizontalRight(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row < 5 && column != 7) {
			listString = chessBoard.getSpots()[row+2][column+1];
		}		
		return listString;
	}	
	
	public boolean canMoveVerticalDownAndHorizontalRight(int row, int column) {
		if(row > 1 && column != 7) return true;
		return false;

	}
	public String moveVerticalDownAndHorizontalRight(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row > 1 && column != 7) {
			listString = chessBoard.getSpots()[row-2][column+1];	
		}
		return listString;
	}	
	
	
	
	public boolean canMoveVerticalDownAndHorizontalLeft(int row, int column) {
		if(row > 1 && column != 0) return true;
		return false;
	}
	public String moveVerticalDownAndHorizontalLeft(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row > 1 && column != 0) {
			listString = chessBoard.getSpots()[row-2][column-1];	
		}
		return listString;
	}
	
	public boolean canMoveVerticalUpAndHorizontalLeft(int row, int column) {
		if(row < 5 && column != 0) return true;
		return false;
	}
	public String moveVerticalUpAndHorizontalLeft(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row < 5 && column != 0) {
			listString = chessBoard.getSpots()[row+2][column-1];	
		}
		return listString;
	}
	
	
	
	
	public boolean canMoveHorizontalRightAndVerticalUp(int row, int column) {
		if(row != 7 && column < 5) return true;
		return false;
	}
	public String moveHorizontalRightAndVerticalUp(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 7 && column < 5) {
			listString = chessBoard.getSpots()[row+1][column+2];	
		}
		return listString;
	}	
	public boolean canMoveHorizontalLeftAndVerticalUp(int row, int column) {
		if(row != 7 && column > 1) return true;
		return false;
	}
	public String moveHorizontalLeftAndVerticalUp(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 7 && column > 1) {
			listString = chessBoard.getSpots()[row+1][column-2];	
		}
		return listString;
	}
	
	
	
	public boolean canMoveHorizontalRightAndVerticalDown(int row, int column) {
		if(row != 0 && column < 6) return true;
		return false;
	}
	public String moveHorizontalRightAndVerticalDown(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 0 && column < 6) {
			listString = chessBoard.getSpots()[row-1][column+2];	
		}
		return listString;
	}
	
	public boolean canMoveHorizontalLeftAndVerticalDown(int row, int column) {
		if(row != 0 && column > 1) return true;
		return false;
	}
	public String moveHorizontalLeftAndVerticalDown(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 0 && column > 1) {
			listString = chessBoard.getSpots()[row-1][column-2];	
		}
		return listString;
	}
	
}
