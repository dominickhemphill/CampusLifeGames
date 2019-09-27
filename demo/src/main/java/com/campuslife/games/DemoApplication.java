package com.campuslife.games;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);

		FileEditor findFile = new FileEditor();
		
		findFile.getfile();
		findFile.getInput();
	}

}
