package com.campuslife.games;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class GameController{
	
	@GetMapping(value="/")
	public String displayPage(ModelMap map) throws IOException {
		FileContentDisplayer list = new FileContentDisplayer();
		map.addAttribute("collection", list.displayContent());
		return "clf";
	}
	
	@PostMapping(value="/")
	public void addGame(@ModelAttribute GameDto game) throws IOException {
		// get file
		File campusLifeGames = new File("CampusLifeGames.txt");	
		
		// check to see if file exist
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
		
		// set up scanner to capture user input
		Scanner input = new Scanner(System.in);
		
		ModelAndView modelAndView = new ModelAndView("clf");
	}
	
	
	
}