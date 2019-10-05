package com.campuslife.games;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		FileContentDisplayer list = new FileContentDisplayer();
		map.addAttribute("collection", list.displayContent());
		return "clf";
	}
	
	@PostMapping(value="/")
	public void addGame() {
		
	}
	
	
}