package com.campuslife.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentDisplayer {

	public void displayContent() throws IOException {
		
		FileReader file = new FileReader("CampusLifeGames.txt");
		BufferedReader reader = new BufferedReader(file);

		String text = "";
		String line;
		
		line = reader.readLine();
		
		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		reader.close();
	}
}
