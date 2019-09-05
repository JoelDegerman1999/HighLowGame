package models;

import java.util.Random;

import javax.swing.JOptionPane;

public class GameLogic {

	private Random random;
	
	private int lowRange;
	private int highRange;
	private int guesses;
	private int randomNo;
	private int guessedNo;
	
	private static int intGamesCreated;

	public GameLogic(int lowRange, int highRange) {
		this.lowRange = lowRange;
		this.highRange = highRange;
		random = new Random();
		intGamesCreated = 0;
		intGamesCreated++;

		randomNo = randomGenerator(lowRange, highRange);
		loopGame();
	}

	private int randomGenerator(int low, int high) {
		return random.nextInt((high + 1) - low) + low;
	}

	private int gameGuesses() {
		return guesses;
	}

	private void loopGame() {
		String stringGuessedNo;
		do {
			stringGuessedNo = JOptionPane
					.showInputDialog("Guess for a number between (" + lowRange + "-" + highRange + ")");
			guessedNo = Integer.parseInt(stringGuessedNo);

			if (guessedNo > randomNo) {
				JOptionPane.showMessageDialog(null, "Lower");
				guesses++;
			} else if (guessedNo < randomNo) {
				JOptionPane.showMessageDialog(null, "Higher");
				guesses++;
			} else {
				JOptionPane.showMessageDialog(null, "You guessed the correct number and it was: (" + randomNo + ")"
						+ " and you guessed: " + gameGuesses() + " times");
			}
		} while (guessedNo != randomNo);
	}
	
}
