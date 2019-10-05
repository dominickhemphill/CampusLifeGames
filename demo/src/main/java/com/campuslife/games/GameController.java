package com.campuslife.games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class GameController{
	
//	@GetMapping(value= "/")
//	public String displayPage(ModelMap map) throws IOException {
//		
//		FileContentDisplayer gameList = new FileContentDisplayer();
//		FileContentDisplayer file = new FileContentDisplayer();
//		
//		final List<String> list = gameList.displayContent();
//		final List<GameDto> list = file.listConverter().getGameList();
//		
//		map.addAttribute("list", list);
//		return "clf";
//		
//	}
	
	@GetMapping(value="/")
	public String displayPage(ModelMap map) throws IOException {
		GameDto game;
		
		List<String> titles = new ArrayList<>();
		List<GameDto> actualGames = new ArrayList<>();;
		GameWarehouseDto collection = new GameWarehouseDto();
		FileContentDisplayer list = new FileContentDisplayer();
		FileReader file = new FileReader("CampusLifeGames.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		
		while (line != null) {
			text += line;
			line = reader.readLine();
			titles.add(line);
		}
		
		for(String gameName : titles) {
			game = new GameDto();
			game.setName(gameName);
			actualGames.add(game);
			
		}
		
		collection.setGameList(actualGames);
		

		map.addAttribute("collection", collection);
		return "clf";
	}
	
	@PostMapping(value="/")
	public void addGame() {
		
	}
	
	
}