package com.campuslife.games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentDisplayer {
	// will display contents of file
	public void displayContent() throws IOException {
		
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
			text += line;
			line = reader.readLine();
		}
		
		// close file/buffered reader
		file.close();
		reader.close();
	}
}
