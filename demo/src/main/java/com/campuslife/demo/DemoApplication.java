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
			final Formatter y;
			
			try {
				y = new Formatter("CampusLifeGames.txt");
				System.out.println("file.txt File Created in Project root directory");
			}
			catch(Exception e) {
				System.out.println("Something went wrong...");
			}
			
		}else {
			System.out.println(campusLifeGames + " already exists");
		}
	}

}
