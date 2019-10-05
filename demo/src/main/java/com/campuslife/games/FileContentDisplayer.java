package com.campuslife.games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileContentDisplayer {
	
	GameDto games;
	GameWarehouseDto warehouse;
	List<String> words;
	List<GameDto> actualGames;
	
	// will display contents of file
	public List<String> displayContent() throws IOException {
		
		words = new ArrayList<>();
		// finds file
		FileReader file = new FileReader("CampusLifeGames.txt");
		// reads file
		BufferedReader reader = new BufferedReader(file);
		
		// empty string to store next line
		String text = "";
		// string to store current line being read
		String line;
		
		line = reader.readLine();
		
		// while loop allows reader to continue through file
		while (line != null) {
			games = new GameDto();
			text += line;
			line = reader.readLine();
			words.add(line);
		}
		
		// close file/buffered reader
		file.close();
		reader.close();
		return words;
	}
	
	
	
	public GameWarehouseDto listConverter() {
		actualGames = new ArrayList<>();
		for(String gameRow : words ) {
			games.setName(gameRow);	
		}
		actualGames.add(games);
		warehouse.setGameList(actualGames);
		return warehouse;
		
	}
}
