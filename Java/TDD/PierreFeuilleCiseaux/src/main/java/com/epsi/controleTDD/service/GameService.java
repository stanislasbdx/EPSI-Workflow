package com.epsi.controleTDD.service;

public class GameService {
	public static int PLAYER_SCORE;
	public static int COMPUTER_SCORE;


	public static void resetScores() {
		PLAYER_SCORE = 0;
		COMPUTER_SCORE = 0;
	}

	public static int getScore() {
		return PLAYER_SCORE;
	}

	public static void setScore(int playerScore) {
		PLAYER_SCORE = playerScore;
	}

	public static void addScore(boolean isPlayer) {
		if (isPlayer) PLAYER_SCORE++;
		else COMPUTER_SCORE++;
	}

	public static String getComputerChoice() {
		String[] words = {"pierre","feuille","ciseaux"};
		int randomIndex = (int)Math.floor(Math.random() * words.length);
		return words[randomIndex];
	}

	public static String winnerProcess(String winner, boolean isPlayer) {
		addScore(isPlayer);
		return winner + " gagne";
	}

	public static String match(String playerAction, String computerAction) {
		if (playerAction.equals(computerAction)) return "Match nul";

		switch (playerAction) {
			case "pierre" -> {
				if (computerAction.equals("ciseaux")) return winnerProcess("Joueur 1", true);
				else return winnerProcess("Joueur 2", false);
			}
			case "feuille" -> {
				if (computerAction.equals("pierre")) return winnerProcess("Joueur 1", true);
				else return winnerProcess("Joueur 2", false);
			}
			case "ciseaux" -> {
				if (computerAction.equals("feuille")) return winnerProcess("Joueur 1", true);
				else return winnerProcess("Joueur 2", false);
			}
		}

		return "Choix non reconnu";
	}
}
