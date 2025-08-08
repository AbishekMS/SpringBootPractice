package com.example.PracticeSessionOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSessionOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSessionOneApplication.class, args);
		MarioGame mario = new MarioGame();
		Contro contro=new Contro();
		GameRunner game = new GameRunner(mario); // always uses MarioGame
		game.displayGame();
		
		
	}

}
