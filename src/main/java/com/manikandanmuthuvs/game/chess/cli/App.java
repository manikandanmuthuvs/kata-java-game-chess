package com.manikandanmuthuvs.game.chess.cli;

import java.util.ArrayList;
import java.util.Scanner;

import com.manikandanmuthuvs.game.chess.controller.ChessGameController;
import com.manikandanmuthuvs.game.chess.domain.ChessBoard;
import com.manikandanmuthuvs.game.chess.usecase.ChessGameUsecaseImpl;

public class App implements Runnable {
    static Scanner scanner;
    static Boolean exit = false;
    
    int ROW_MAX_LENGTH = 8;
	int COLUMN_MAX_LENGTH = 8;	
	String[] rowName= {"A","B","C","D","E","F","G","H"};
	String[] columeName= {"1","2","3","4","5","6","7","8",};
	
	ChessGameController chessGameController = new ChessGameController();
	ChessBoard chessBoard;
	
	public App() {
		chessGameController = new ChessGameController();
		chessBoard = chessGameController.createChessBoard(ROW_MAX_LENGTH, COLUMN_MAX_LENGTH, rowName, columeName);
	}
   
    public void run() {
        while (true) {
            String[] commands = scanner.nextLine().trim().split("\\s+");
            if (commands.length == 0 && commands.length > 3) {
                System.out.println("please enter the valid commands");
            }
            if (commands[0].equals("exit")) {
                exit = true;
                break;
            }           
            if (commands.length > 0) {
        		String piece = commands[0].trim();
        		String currentPosition = commands[1].trim();
        		String movebleSpots = chessGameController.findAllMoveableSpotsOf(chessBoard,piece,currentPosition);
        		System.out.println(movebleSpots);
            }

        }
    }
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Thread thread = new Thread(new App());
        thread.start();
        while (true) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            if (exit == true)
                break;
        }
    }
}
