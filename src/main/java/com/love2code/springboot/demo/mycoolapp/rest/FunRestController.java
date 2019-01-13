package com.love2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	
	//expose / end point
	
	@GetMapping("/")
	public String getIndexPage() {
		return "Hello !!! \n Time on server is " + LocalDateTime.now() +" team name " + teamName;
	}
	
	@GetMapping("/devtools")
	public String getdevToolsImpl() {
		return "Dev Tools Page !!!";
	}

}
