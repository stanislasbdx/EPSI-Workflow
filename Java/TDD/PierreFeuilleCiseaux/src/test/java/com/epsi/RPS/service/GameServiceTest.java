package com.epsi.RPS.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameServiceTest {
	@Test
	public void testResetScores() {
		GameService.resetScores();
		assertEquals(0, GameService.PLAYER_SCORE);
		assertEquals(0, GameService.COMPUTER_SCORE);
	}

	@Test
	public void testGetScore() {
		GameService.resetScores();
		String expected = "SCORES : joueur -> 0 | 0 <- ordinateur";
		assertEquals(expected, GameService.getScore());
	}

	@Test
	public void testSetScore() {
		GameService.resetScores();
		GameService.setScore(5);
		assertEquals(5, GameService.PLAYER_SCORE);
	}

	@Test
	public void testGetComputerChoice() {
		String computerChoice = GameService.getComputerChoice();
		assertTrue(computerChoice.equals("pierre") || computerChoice.equals("feuille") || computerChoice.equals("ciseaux"));
	}

	@Test
	public void testDecideWinner() {
		GameService.resetScores();
		String playerAction = "pierre";
		String computerAction = "ciseaux";
		String expectedResult = "Le joueur 1 gagne !";
		assertEquals(expectedResult, GameService.decideWinner(playerAction, computerAction));
		assertEquals(1, GameService.PLAYER_SCORE);
		assertEquals(0, GameService.COMPUTER_SCORE);
	}
}
