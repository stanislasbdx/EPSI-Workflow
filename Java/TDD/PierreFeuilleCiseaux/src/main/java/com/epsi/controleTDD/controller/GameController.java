package com.epsi.controleTDD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.epsi.controleTDD.service.GameService.*;

@RestController
@RequestMapping("/game")
public class GameController {

	@GetMapping("/play/{action}")
	public String play(@PathVariable("action") String action) {
		String computerAction = getComputerChoice();

		return match(action, computerAction);
	}

	@GetMapping("/restart")
	public void reset() {
		resetScores();
	}

	@GetMapping("/score")
	public int score() {
		return getScore();
	}

	@GetMapping("/score/{score}")
	public void setscore(@PathVariable("score") String score) {
		setScore(Integer.parseInt(score));
	}

}
