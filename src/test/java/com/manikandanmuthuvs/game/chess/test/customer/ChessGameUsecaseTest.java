package com.manikandanmuthuvs.game.chess.test.customer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.manikandanmuthuvs.game.chess.contract.usecase.ChessGameUsecaseContract;
import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.test.utils.ChessGameTestUtils;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;

public class ChessGameUsecaseTest {
	ChessGameTestUtils chessGameTestUtils;
	ChessGameUsecaseContract chessGameUsecaseContract;	
	ChessBoard chessBoard;
	int ROW_MAX_LENGTH = 8;
	int COLUMN_MAX_LENGTH = 8;
	String[] rowName= {"A","B","C","D","E","F","G","H"};
	String[] columeName= {"1","2","3","4","5","6","7","8",};
	
	public ChessGameUsecaseTest() {
		chessGameTestUtils = new ChessGameTestUtils();
		chessGameUsecaseContract = chessGameTestUtils.createChessGameUsecase();
		chessBoard = chessGameUsecaseContract.createChessBoard(ROW_MAX_LENGTH,COLUMN_MAX_LENGTH,rowName,columeName);
	}
	
	@Test
	public void PAWN_Wants_To_Findout_All_Possible_Moveable_Spots_From_Its_Current_Spot_In_The_Empty_ChessBoard() {
		String[] expectedMoveableSpot = new String[] {"E4"};
				
		String[] actualMoveAbleSpots = chessGameUsecaseContract.findAllMoveableSpotsOf(chessBoard,"PAWN","E3");
		
		assertThat(actualMoveAbleSpots,is(expectedMoveableSpot));
	}
	
	@Test
	public void KING_Wants_To_Findout_All_Possible_Moveable_Spots_From_His_Current_Spot_In_TheEmptyChessBoard() {
		String[] expectedMoveableSpots = new String[] {"D6", "E6", "E5","E4", "D4", "C4", "C5", "C6"};
	
		String[] actualMoveAbleSpots = chessGameUsecaseContract.findAllMoveableSpotsOf(chessBoard,"KING","D5");
		
		assertThat(actualMoveAbleSpots,is(expectedMoveableSpots));
	}
	
	@Test
	public void QUEEN_Wants_To_Findout_All_Possible_Moveable_Spots_From_Her_Current_Spot_In_TheEmptyChessBoard() {
		String[] expectedMoveableSpots = new String[] {"C5C6C7C8", "D5E6F7G8", "D4E4F4G4H4", "D3E2F1", "C3C2C1", "B3A2", "B4A4", "B5A6"};
		
		String[] actualMoveAbleSpots = chessGameUsecaseContract.findAllMoveableSpotsOf(chessBoard,"QUEEN","C4");
		
		assertThat(actualMoveAbleSpots,is(expectedMoveableSpots));
	}
	
	@Test
	public void ROOK_Wants_To_Findout_All_Possible_Moveable_Spots_From_Its_Current_Spot_In_TheEmptyChessBoard() {
		String[] expectedMoveableSpots = new String[] {"E4E5E6E7E8", "F3G3H3", "E2E1", "D3C3B3A3"};
		
		String[] actualMoveAbleSpots = chessGameUsecaseContract.findAllMoveableSpotsOf(chessBoard,"ROOK","E3");
				
		assertThat(actualMoveAbleSpots,is(expectedMoveableSpots));
	}
}
