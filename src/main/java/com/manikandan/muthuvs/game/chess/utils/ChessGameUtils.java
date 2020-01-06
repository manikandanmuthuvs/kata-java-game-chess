package com.manikandan.muthuvs.game.chess.utils;

import com.manikandanmuthuvs.game.chess.contract.usecase.PieceMoveVerticalUpContract;
import com.manikandanmuthuvs.game.chess.domain.Bishop;
import com.manikandanmuthuvs.game.chess.domain.Horse;
import com.manikandanmuthuvs.game.chess.domain.King;
import com.manikandanmuthuvs.game.chess.domain.Pawn;
import com.manikandanmuthuvs.game.chess.domain.Queen;
import com.manikandanmuthuvs.game.chess.domain.Rook;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;

public class ChessGameUtils {
	PieceMoveVerticalUpContract pawn = new Pawn();
	King king = new King();
	Queen queen = new Queen();
	Rook rook = new Rook();
	Horse horse = new Horse();
	Bishop bishop = new Bishop();
	
	public ChessGameUtils() {		
	}
	
	public ChessGameUsecaseImpl createChessGameUsecase() {
		ChessGameUsecaseImpl chessGameUsecaseImpl = ChessGameUsecaseImpl.builder()
				.pawn(pawn)
				.king(king)
				.queen(queen)
				.rook(rook)
				.horse(horse)
				.bishop(bishop)
				.build();
		return chessGameUsecaseImpl;
	}
}
