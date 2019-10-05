package com.campuslife.games;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEditor {

	public void getfile() throws IOException {

		File campusLifeGames = new File("CampusLifeGames.txt");

		if (campusLifeGames.createNewFile()) {
			final DefaultFile cLGames = new DefaultFile();

			try {
				cLGames.startingTemplate();
				System.out.println(campusLifeGames + " file created.");
			} catch (Exception e) {
				System.out.println("Something went wrong...");
			}

		} else {
			System.out.println(campusLifeGames + " already exists.");
		}
	}

	@SuppressWarnings("resource")
	public void addGame() {
		GameDto newGame = new GameDto();
		GameWarehouseDto  list = new GameWarehouseDto();
		
		Scanner input;
		input = new Scanner(System.in);
		String game = input.nextLine();
		newGame.setName(game);
		list.addGame(newGame);

		System.out.println("The game " + newGame + " has been added to the game warehouse.");
	}
}
