package com.example.PracticeSessionOne;

public class GameRunner {
	
	Games games; //loose coupling
	GameRunner(Games games){
		this.games=games;
	}
	
	public void displayGame() {
		games.gameDetails();
	}

}
