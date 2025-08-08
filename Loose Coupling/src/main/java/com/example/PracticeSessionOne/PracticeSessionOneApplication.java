package com.example.PracticeSessionOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSessionOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSessionOneApplication.class, args);
		//Games game = new MarioGame();
		Games game=new Contro();
		GameRunner gameRunner = new GameRunner(game); 
		gameRunner.displayGame();
		
		
	}

}
