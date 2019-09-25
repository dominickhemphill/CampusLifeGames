package com.campuslife.games;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEditor {

	public void getfile() throws IOException {
		
		File campusLifeGames = new File("CampusLifeGames.txt");
		
		if(campusLifeGames.createNewFile()) {
			final DefaultFile cLGames = new DefaultFile();
			
			try {
				cLGames.startingTemplate();
				System.out.println(campusLifeGames + " file created.");
			}
			catch(Exception e) {
				System.out.println("Something went wrong...");
			}
			
		}else {
			System.out.println(campusLifeGames + " already exists.");
		}
	}
	
	
	public void getInput() {
	Scanner newGame = new Scanner(System.in);
	
	System.out.println(newGame.nextLine());
	}
}
