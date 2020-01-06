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
public class Bishop {
	private String currentfSpot;
	private String[] moveableSpots;
	

	public String moveDiagonalDownLeft(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();	
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 0 && column != 0) {
			for (int i = row; i < 7; i++) {
				row -= 1;
				column -= 1;
				if(row == -1 || column == -1) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}
		return listString;
	}

	public String moveDiagonalDownRight(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 0 && column != 7) {
			for (int i = row; i < 7; i++) {
				row -= 1;
				column += 1;
				if(row == -1 || column > 7) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}	
		return listString;		
	}
	
	public String moveDiagonalUpLeft(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 7 && column != 0) {
			for (int i = row; i < 7; i++) {
				row += 1;
				column -= 1;
				if(row > 7 || column == -1) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}		
		return listString;
		
	}

	public String moveDiagonalUpRight(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 7 && column != 7) {
			for (int i = row; i < 7; i++) {
				row += 1;
				column += 1;
				if(row > 7 || column > 7) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}
		return listString;
		
	}
	
}
