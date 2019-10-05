package com.campuslife.games;

import java.util.List;

public class GameWarehouseDto {
	
	public List<GameDto> gameList;

	//Getters and Setters
	public List<GameDto> getGameList() {
		return gameList;
	}

	public void setGameList(List<GameDto> gameList) {
		this.gameList = gameList;
	}
	
	public void addGame(final GameDto game) {
		gameList.add(game);
	}
	
	public void removeGame(final GameDto game) {
		gameList.remove(game);
	}

	//Empty Constructor
	public GameWarehouseDto() {		
	}

	//To String
	@Override
	public String toString() {
		return "GameWarehouseDto [gameList=" + gameList + "]";
	}
	
	

}
