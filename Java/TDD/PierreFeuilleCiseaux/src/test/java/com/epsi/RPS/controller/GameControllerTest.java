package com.epsi.RPS.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(GameController.class)
public class GameControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testPlayRPS() throws Exception {
		mockMvc.perform(get("/game/play/pierre"))
				.andExpect(status().isOk())
				.andExpect(content().string("Le joueur 1 gagne !"));
	}

	@Test
	public void testRestartGame() throws Exception {
		mockMvc.perform(get("/game/restart"))
				.andExpect(status().isOk())
				.andExpect(content().string("Score remis à zéro"));
	}

	@Test
	public void testGetScore() throws Exception {
		mockMvc.perform(get("/game/score"))
				.andExpect(status().isOk())
				.andExpect(content().string("SCORES : joueur -> 0 | 0 <- ordinateur"));
	}

	@Test
	public void testSetScore() throws Exception {
		mockMvc.perform(get("/game/score/3"))
				.andExpect(status().isOk())
				.andExpect(content().string("Score modifié !"));
	}
	
}
