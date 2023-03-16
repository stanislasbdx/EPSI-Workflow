package com.epsi.RPS.controller;

import com.epsi.RPS.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.epsi.RPS.service.GameService.*;

@RestController
@RequestMapping("/game")
public class GameController {

	@GetMapping("/play/{action}")
	public String playRPS(@PathVariable("action") String action) {
		String computerAction = getComputerChoice();

		return decideWinner(action.toLowerCase(), computerAction.toLowerCase());
	}

	@GetMapping("/restart")
	public String restartGame() {
		resetScores();

		return "Score remis à zéro";
	}

	@GetMapping("/score")
	public String getScore() {
		return GameService.getScore();
	}

	@GetMapping("/score/{playerScore}")
	public String setScore(@PathVariable("playerScore") String playerScore) {
		GameService.setScore(Integer.parseInt(playerScore));

		return "Score modifié !";
	}

}
