package com.example.PracticeSessionOne;

public class GameRunner {
	
	MarioGame mario; //tight coupling
	GameRunner(MarioGame mario){
		this.mario=mario;
	}
	
	public void displayGame() {
		mario.gameDetails();
	}

}
