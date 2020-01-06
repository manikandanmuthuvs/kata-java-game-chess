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
public class Queen {
	private String currentfSpot;
	private String[] moveableSpotsInableSpots;
	private int ROW_MIN_POSITION = 0;
	private int ROW_MAX_POSITION = 7;
	private int COLUMN_MIN_POSITION = 0;
	private int COLUMN_MAX_POSITION = 7;

	public String moveableSpotsInDiagonalDownLeft(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();
		String listString = "";
		int row = spot.positionX;
		int column = spot.positionY;
		if(row != 0 && column != 0) {
			for (int i = row; i < 7; i++) {
				row -= 1;
				column -= 1;
				if(row == -1 || column == -1) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}		
		return listString;
	}

	public String moveableSpotsInDiagonalDownRight(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();	
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";

		if(row != 0 && column != 7) {
			for (int i = row; i < 7; i++) {
				row -= 1;
				column += 1;
				if(row == -1 || column > 7) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
		
		return listString;
	}

	public String moveableSpotsInDiagonalUpLeft(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;	
		String listString = "";

		if(row != 7 && column != 0) {
			for (int i = row; i < 7; i++) {
				row += 1;
				column -= 1;
				if(row > 7 || column == -1) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
		
		return listString;
		
	}

	public String moveableSpotsInDiagonalUpRight(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";

		if(row != 7 && column != 7) {
			ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
			for (int i = row; i < 7; i++) {
				row += 1;
				column += 1;
				if(row > 7 || column > 7) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
		
	
		return listString;
		
	}

	public String moveableSpotsInVerticalUp(ChessBoard chessBoard, Spot spot) {				
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";

		if(row != 7 && column != 7) {
			ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
			for (int i = row; i < 7; i++) {
				row += 1;
				if(row > 7) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
		
		return listString;
		
	}

	public String moveableSpotsInVerticalDown(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;	
		String listString = "";

		if(row != 0) {
			ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
			for (int i = row; i < 7 ; i++) {
				row -= 1;
				if(row == -1) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
	
		return listString;
		
	}

	public String moveableSpotsInHorizontalLeft(ChessBoard chessBoard, Spot spot) {
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";

		if(column != 0) {
			ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
			for (int i = column; i < 7; i++) {
				column -= 1;
				if(column == -1) break;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
	
		return listString;
	}

	public String moveableSpotsInHorizontalRight(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpotsInableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";

		if(column != 7) {
			for (int i = column; i < 7; i++) {
				int columnIndex = i+1;
				moveableSpotsInableSpots.add(chessBoard.getSpots()[row][columnIndex]);
			}
			for (String moveableSpotsInableSpot : moveableSpotsInableSpots)
			{
			    listString += moveableSpotsInableSpot;
			}
		}
		return listString;
	}
	
}
