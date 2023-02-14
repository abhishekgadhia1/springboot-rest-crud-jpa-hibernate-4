package com.practice.SpringBootNinth.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.SpringBootNinth.bean.Game;

public interface GameRepository extends CrudRepository<Game, String>{

}
