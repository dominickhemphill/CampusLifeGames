package com.campuslife.games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileContentDisplayer {

	// will display contents of file
	public GameWarehouseDto displayContent() throws IOException {
		
		GameDto game;
		List<GameDto> actualGames = new ArrayList<>();
		List<String> collection = new ArrayList<>();
		GameWarehouseDto collections = new GameWarehouseDto();
		FileReader file = new FileReader("CampusLifeGames.txt");
		BufferedReader reader = new BufferedReader(file);
		
		// set text to the string equivalent of "null"
		String text = "";
		String line = reader.readLine();

		// read file line by line, adding it to our list
		while (line != null) {
			text += line;
			line = reader.readLine();
			collection.add(line);
		}

		// convert each line of the list into a game object
		for (String gameName : collection) {
			game = new GameDto();
			game.setName(gameName);
			actualGames.add(game);

		}

		// store each game object in the warehouse (list containing game objects)
		collections.setGameList(actualGames);

		// close file/buffered reader
		file.close();
		reader.close();
		
		// spread the love
		return collections;
	}
}
