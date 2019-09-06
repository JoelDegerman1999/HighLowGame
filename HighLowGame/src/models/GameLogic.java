package models;

import java.util.Random;

import javax.swing.JOptionPane;

public class GameLogic {

	private Random random;

	private int lowRange;
	private int highRange;
	private int randomNo;
	private int guessedNo;
	private int guesses;

	private static int totalGuesses = 0;
	private static double gamesCreated = 0;

	public GameLogic(int lowRange, int highRange) {
		this.lowRange = lowRange;
		this.highRange = highRange;

		random = new Random();

		gamesCreated++;

		guesses = 0;

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
				totalGuesses++;
				System.out.println(guesses);
				System.out.println(totalGuesses);
			} else if (guessedNo < randomNo) {
				JOptionPane.showMessageDialog(null, "Higher");
				guesses++;
				totalGuesses++;
				System.out.println(guesses);
				System.out.println(totalGuesses);
			} else {
				guesses++;
				totalGuesses++;
				JOptionPane.showMessageDialog(null, "You guessed the correct number and it was: (" + randomNo + ")"
						+ " and you guessed: " + gameGuesses() + " times");
				System.out.println(guesses);
				System.out.println(totalGuesses);

			}
		} while (guessedNo != randomNo);
	}

	public static double gamesCreated() {
		return gamesCreated;
	}

	public static double averageGuesses() {

		return totalGuesses / gamesCreated;
	}
}
