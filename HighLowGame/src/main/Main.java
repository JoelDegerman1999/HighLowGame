package main;

import models.GameLogic;

public class Main {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic(30, 35);
		GameLogic gameLogic1 = new GameLogic(70, 75); 

		
		System.out.println(GameLogic.averageGuesses());
	}

}
