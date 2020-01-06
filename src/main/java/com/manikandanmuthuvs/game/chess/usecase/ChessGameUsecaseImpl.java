package com.manikandanmuthuvs.game.chess.usecase;

import java.util.ArrayList;
import java.util.UUID;

import com.manikandanmuthuvs.game.chess.contract.usecase.ChessGameUsecaseContract;
import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveVerticalUpContract;
import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.domain.King;
import com.manikandanmuthuvs.game.chess.domain.Queen;
import com.manikandanmuthuvs.game.chess.domain.Rook;
import com.manikandanmuthuvs.game.chess.domain.Spot;

import lombok.Builder;
import lombok.Data;


/**
* 
*
* @author Manikandan Muthuvs
*/

@Data
@Builder
public class ChessGameUsecaseImpl implements ChessGameUsecaseContract {
	PieceMoveVerticalUpContract pawn;
	King king;
	Queen queen;
	Rook rook;

 	public ChessBoard createChessBoard(int ROW_MAX_LENGTH, int COLUMN_MAX_LENGTH,		
		String[] rowName, String[] columeName) {
		
		String[][] spot = new String[ROW_MAX_LENGTH][COLUMN_MAX_LENGTH];
		String spotName;
		
		for (int row = 0; row < ROW_MAX_LENGTH; row++) {			
			for (int column = 0; column < COLUMN_MAX_LENGTH; column++) {
				spotName = rowName[column] + columeName[row];
				spot[row][column] = spotName;
			}
		}		
		ChessBoard chessBoard = ChessBoard.builder()
			.id(UUID.randomUUID().toString())
			.spots(spot)
			.build();
		
		return chessBoard;		
	}

 	private Spot findCurrentSpotCoordination(ChessBoard chessBoard, String piece, String spotName) {
		Spot currentSpotCoordination = null;
		
		String[][] chessBoardsSpots = chessBoard.getSpots();		
		int rowLengthOfBoard = chessBoard.getSpots()[0].length;
		int columnLengthOfBoard = chessBoard.getSpots()[1].length;
		
		for (int row = 0; row < rowLengthOfBoard ; row++) {			
			for (int column = 0; column < columnLengthOfBoard; column++) {
				if(chessBoardsSpots[row][column].equals(spotName )) {
					currentSpotCoordination = new Spot(row,column);				
				}
			}
		}
		return currentSpotCoordination;
	}
	
	public String[] findAllMoveableSpotsOf(ChessBoard chessBoard, String piece, String currentSpotName) {
		ArrayList<String> moveAbleSpotNames = new ArrayList<String>();
		Spot fromCurrentSpot = findCurrentSpotCoordination(chessBoard,piece,currentSpotName);

		if(piece.equals("PAWN")) {
			moveAbleSpotNames.add(pawn.moveableSpotInVerticalUp(chessBoard,fromCurrentSpot));
		}
		else if(piece.equals("KING")) {
			moveAbleSpotNames.add(king.moveableSpotInVericalUp(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInDiagonalUpRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInHorizontalRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInDiagonalDownRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInVericalDown(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInDiagonalDownLeft(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInHorizontalLeft(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(king.moveableSpotInDiagonalUpLeft(chessBoard, fromCurrentSpot));
		}
		else if(piece.equals("QUEEN")) {
			moveAbleSpotNames.add(queen.moveableSpotsInVerticalUp(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInDiagonalUpRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInHorizontalRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInDiagonalDownRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInVerticalDown(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInDiagonalDownLeft(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInHorizontalLeft(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(queen.moveableSpotsInDiagonalUpLeft(chessBoard, fromCurrentSpot));
		}
		else if(piece.equals("ROOK")) {
			moveAbleSpotNames.add(rook.moveVerticalUp(chessBoard,fromCurrentSpot));
			moveAbleSpotNames.add(rook.moveHorizontalRight(chessBoard, fromCurrentSpot));
			moveAbleSpotNames.add(rook.moveVerticalDown(chessBoard,fromCurrentSpot));
			moveAbleSpotNames.add(rook.moveHorizontalLeft(chessBoard,fromCurrentSpot));
		}		
		String[] actualMoveAbleSpots = new String[moveAbleSpotNames.size()];		
		actualMoveAbleSpots = moveAbleSpotNames.toArray(actualMoveAbleSpots);
		return actualMoveAbleSpots;
	}
}
