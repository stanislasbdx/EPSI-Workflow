package com.epsi.RPS.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameService {
	public static int PLAYER_SCORE;
	public static int COMPUTER_SCORE;


	public static void resetScores() {
		PLAYER_SCORE = 0;
		COMPUTER_SCORE = 0;
	}

	public static String getScore() {
		return "SCORES : joueur -> " + PLAYER_SCORE + " | " + COMPUTER_SCORE + " <- ordinateur";
	}

	public static void setScore(int playerScore) {
		PLAYER_SCORE = playerScore;
	}

	public static String getComputerChoice() {
		Random random = new Random();
		int randInt = random.nextInt(3);

		ArrayList<String> choices = new ArrayList<>(Arrays.asList("pierre","feuille","ciseaux"));

		return choices.get(randInt);
	}

	public static String decideWinner(String playerAction, String computerAction) {
		if (playerAction.equals(computerAction)) {
			return "Match nul !";
		}

		if (playerAction.equals("pierre")) {
			if (computerAction.equals("ciseaux")) {
				PLAYER_SCORE++;
				return "Le joueur 1 gagne !";
			} else {
				COMPUTER_SCORE++;
				return "Le joueur 2 gagne !";
			}
		}

		if (playerAction.equals("papier")) {
			if (computerAction.equals("pierre")) {
				PLAYER_SCORE++;
				return "Le joueur 1 gagne !";
			} else {
				COMPUTER_SCORE++;
				return "Le joueur 2 gagne !";
			}
		}

		if (playerAction.equals("ciseaux")) {
			if (computerAction.equals("papier") || computerAction.equals("feuille")) {
				PLAYER_SCORE++;
				return "Le joueur 1 gagne !";
			} else {
				COMPUTER_SCORE++;
				return "Le joueur 2 gagne !";
			}
		}

		return "Erreur";
	}
}
