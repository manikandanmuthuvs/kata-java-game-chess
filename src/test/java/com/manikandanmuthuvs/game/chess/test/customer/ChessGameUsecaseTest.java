package com.manikandanmuthuvs.game.chess.test.customer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
	
	
}
