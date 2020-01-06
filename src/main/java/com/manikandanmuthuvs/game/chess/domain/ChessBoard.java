package com.manikandanmuthuvs.game.chess.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChessBoard {
	private String id;
	private String[][] spots;
}
