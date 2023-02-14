package com.practice.SpringBootNinth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBootNinth.bean.Game;
import com.practice.SpringBootNinth.service.GameService;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;
	
	@RequestMapping("/games")
	public List<Game> getAllGames()
	{
		return gameService.getAllGames();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/games")
	public void addGame(@RequestBody Game game)
	{
		gameService.addGame(game);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/games/{id}")
	public void updateGame(@PathVariable String id, @RequestBody Game game)
	{
		gameService.updateGame(id, game);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/games/{id}")
	public void deleteGame(@PathVariable String id)
	{
		gameService.deleteGame(id);
	}
}
