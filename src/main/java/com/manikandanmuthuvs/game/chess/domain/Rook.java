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
public class Rook {
	private String currentfSpot;
	private String[] moveableSpots;
	
	public String moveVerticalUp(ChessBoard chessBoard, Spot spot) {				
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		int row = spot.positionX;
		int column = spot.positionY;
		String listString = "";
		if(row != 7) {
			for (int i = row; i < 7; i++) {
				row += 1;
				if(row > 8) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}	
		return listString;
		
	}
	public boolean canMoveVericalDown(int row) {
		if(row != 0) return true;
		return false;
	}
	public String moveVerticalDown(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		String listString = "";

		int row = spot.positionX;
		int column = spot.positionY;
		if(row != 0) {
			for (int i = row; i < 7 ; i++) {
				row -= 1;
				if(row == -1) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		}

		return listString;
		
	}
	public boolean canMoveHorizontalLeft(int column) {
		if(column != 0) return true;
		return false;
	}
	public String moveHorizontalLeft(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();	
		String listString = "";
		int row = spot.positionX;
		int column = spot.positionY;
		
		if(column != 0) {
			for (int i = column; i <=7 ; i++) {
				column -= 1;
				if(column == -1) break;
				moveableSpots.add(chessBoard.getSpots()[row][column]);
			}
			for (String moveableSpot : moveableSpots)
			{
			    listString += moveableSpot;
			}
		};

	
		return listString;
	}
	public boolean canMoveHorizontalRight(int column) {
		if(column != 7) return true;
		return false;
	}
	
	public String moveHorizontalRight(ChessBoard chessBoard, Spot spot) {
		ArrayList<String> moveableSpots = new ArrayList<String>();		
		String listString = "";
		int row = spot.positionX;
		int column = spot.positionY;
		if(column != 7) {
			for (int i = column; i < 8; i++) {
				column += 1;
				if(column > 7) break;
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
