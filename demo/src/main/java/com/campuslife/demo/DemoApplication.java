package com.campuslife.demo;

import java.io.File;
import java.util.Formatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		File x = new File("CampusLifeGames.txt");
		
		if(!x.exists()) {
			final Formatter y;
			
			try {
				y = new Formatter("CampusLifeGames.txt");
				System.out.println(x + " created");
			}
			catch(Exception e) {
				System.out.println("Something went wrong...");
			}
			
		}
	}

}
