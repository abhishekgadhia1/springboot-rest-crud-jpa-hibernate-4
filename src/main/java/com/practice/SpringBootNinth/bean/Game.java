package com.practice.SpringBootNinth.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game1")
public class Game {

	@Id
	private int id;
	private String name;

	public Game(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + "]";
	}

}
