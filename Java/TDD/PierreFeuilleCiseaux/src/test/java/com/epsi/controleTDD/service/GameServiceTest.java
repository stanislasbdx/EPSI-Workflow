package com.epsi.controleTDD.service;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameServiceTest {
	@Test
	public void test_reset_scores() {
		GameService.resetScores();
		assertEquals(0, GameService.PLAYER_SCORE);
		assertEquals(0, GameService.COMPUTER_SCORE);
	}

	@Test
	public void test_recup_scores_0() {
		GameService.resetScores();
		assertEquals(0, GameService.getScore());
	}

	@Test
	public void test_def_scores_1() {
		GameService.setScore(1);
		assertEquals(1, GameService.PLAYER_SCORE);
	}

	@Test
	public void test_recup_choix_ordi() {
		String computerChoice = GameService.getComputerChoice();
		assertTrue(computerChoice.equals("pierre") || computerChoice.equals("feuille") || computerChoice.equals("ciseaux"));
	}

	@Test
	public void test_jouer_partie() {
		GameService.resetScores();
		String playerAction = "feuille";
		String computerAction = "ciseaux";
		String expectedResult = "Joueur 2 gagne";
		assertEquals(expectedResult, GameService.match(playerAction, computerAction));
		assertEquals(0, GameService.PLAYER_SCORE);
		assertEquals(1, GameService.COMPUTER_SCORE);
	}
}
