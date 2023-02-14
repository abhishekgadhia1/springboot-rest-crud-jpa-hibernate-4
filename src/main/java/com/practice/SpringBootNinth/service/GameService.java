package com.practice.SpringBootNinth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBootNinth.bean.Game;
import com.practice.SpringBootNinth.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> getAllGames() {
		
		List<Game> games = new ArrayList<>();
		gameRepository.findAll().forEach(games :: add);
		return games;
	}

	public void addGame(Game game) {
		gameRepository.save(game);
		
	}

	public void updateGame(String id, Game game) {
		gameRepository.save(game);
		
	}

	public void deleteGame(String id) {
		// TODO Auto-generated method stub
		gameRepository.deleteById(id);
		
	}
}
