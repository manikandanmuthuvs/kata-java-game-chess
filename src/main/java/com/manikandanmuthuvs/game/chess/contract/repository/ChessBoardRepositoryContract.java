package com.manikandanmuthuvs.game.chess.contract.repository;

import com.manikandanmuthuvs.game.chess.domain.ChessBoard;

public interface ChessBoardRepositoryContract {
	public void create(ChessBoard chessBoard);
	public ChessBoard findBy(String chessBoardId);
}
