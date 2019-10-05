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
		String text = "";
		String line = reader.readLine();

		while (line != null) {
			text += line;
			line = reader.readLine();
			collection.add(line);
		}

		for (String gameName : collection) {
			game = new GameDto();
			game.setName(gameName);
			actualGames.add(game);

		}

		collections.setGameList(actualGames);

		// close file/buffered reader
		file.close();
		reader.close();
		return collections;
	}
}
