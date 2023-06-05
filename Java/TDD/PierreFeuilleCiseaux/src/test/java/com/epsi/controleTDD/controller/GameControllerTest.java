package com.epsi.controleTDD.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(GameController.class)
public class GameControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test_partie_papier() throws Exception {
		mockMvc.perform(get("/game/play/papier"))
				.andExpect(status().isOk())
				.andExpect(content().string("Joueur 1 gagne"));
	}

	@Test
	public void test_reset_partie() throws Exception {
		mockMvc.perform(get("/game/restart"))
				.andExpect(status().isOk());
	}

	@Test
	public void test_recup_score_0() throws Exception {
		mockMvc.perform(get("/game/score"))
				.andExpect(status().isOk())
				.andExpect(content().string("0"));
	}

	@Test
	public void test_def_score_1() throws Exception {
		mockMvc.perform(get("/game/score/1"))
				.andExpect(status().isOk());
	}
	
}
