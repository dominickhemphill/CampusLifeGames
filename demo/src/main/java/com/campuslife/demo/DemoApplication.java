package com.campuslife.demo;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		
		File campusLifeGames = new File("CampusLifeGames.txt");
		
		if(campusLifeGames.createNewFile()) {
			final FileEditor cLGames = new FileEditor();
			
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

}
