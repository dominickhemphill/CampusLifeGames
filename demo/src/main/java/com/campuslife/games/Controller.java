package com.campuslife.games;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
	@RequestMapping("/")
	public List<String> displayPage() throws IOException {
		FileContentDisplayer gameList = new FileContentDisplayer();
		
		final List<String> list = gameList.displayContent();
		return list;
		
	}
	
}