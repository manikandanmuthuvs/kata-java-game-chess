package com.manikandanmuthuvs.game.chess.test.customer;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import com.manikandanmuthuvs.game.chess.test.utils.ChessGameTestUtils;

public class ChessGameUsecaseTest {
	ChessGameTestUtils chessGameTestUtils;
	int ROW_MAX_LENGTH = 8;
	int COLUMN_MAX_LENGTH = 8;
	String[] rowName= {"A","B","C","D","E","F","G","H"};
	String[] columeName= {"1","2","3","4","5","6","7","8",};
	public ChessGameUsecaseTest() {
		chessGameTestUtils = new ChessGameTestUtils();
	}
	
	@Test
	public void PAWN_Wants_To_Findout_All_Possible_Moveable_Spots_From_Its_Current_Spot_In_The_Empty_ChessBoard() {
		String[] expectedMoveableSpot = new String[] {"E4"};
		
		ChessGameUsecaseImpl chessGameUsecaseImpl = chessGameTestUtils.createChessGameUsecase();	
		
		String[] actualMoveAbleSpots = chessGameUsecaseImpl.findAllMovableSpotsOf(chessBoard,"PAWN","E3");
		
		assertThat(actualMoveAbleSpots,is(expectedMoveableSpot));
	}
	
	
}
