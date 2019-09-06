package main;

import models.GameLogic;

public class Main {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic(40, 100);
		GameLogic gameLogic1 = new GameLogic(30, 100);
		
		System.out.println(GameLogic.gamesCreated());
		System.out.println(GameLogic.averageGuesses());
		
	}

}
