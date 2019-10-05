package com.campuslife.games;

import java.io.IOException;
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
	public String displayPage(ModelMap map) {
		FileContentDisplayer gameList = new FileContentDisplayer();
		GameWarehouseDto collection = gameList.listConverter();
		map.addAttribute("collection", collection);
		return "clf";
	}
	
	@PostMapping(value="/")
	public void addGame() {
		
	}
	
	
}