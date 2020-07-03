package com.clough.rockPaperScissorsProject;

public class RockPaperScissorsDriver {

	public static void main(String[] args) {

		//private static RockPaperScissors ans;
		//int response = 0;
		String choice = "";
		//int answer;*/
		int userinput;
		int rock = 0;
		int paper = 1;
		int scissors = 2;
		
		RockPaperScissors ans = new RockPaperScissors();
		
		System.out.println("Welcome to the Ultimate Rock Paper Scissors Game!\n");
		System.out.println("Enter one of the below responses to start the game:\n\n");
		System.out.println("Rock: 0\n\nPaper: 1\n\nScissors: 2\n\n");
		System.out.println("To exit: 5\n");
		
		try {
		do {
		System.out.print("Enter selection: ");
		userinput = ans.getResponse();
		
		switch(userinput) {
		case 0:
			choice = "Rock";
			break;
		case 1:
			choice = "Paper";
			break;
		case 2:
			choice = "Scissors";
			break;
		case 5:
			choice = "Game over";
			System.out.println(choice);
			System.exit(0);
		default:
			System.out.println("Invalid entry please try again");
			System.exit(0);
			
			
		}
		System.out.println("You chose " + choice);

	
	
	int sysoutput = ans.getAnswer();
	
	switch(sysoutput) {
	case 0:
		choice = "Rock";
		break;
	case 1:
		choice = "Paper";
		break;
	case 2:
		choice = "Scissors";
		break;
	}
	System.out.println("The computer selected " + choice);
	
	ans.getResult(userinput, sysoutput);
	
		}while(userinput != 5);
	

}
		catch(Exception e) {
			System.out.println("Invalid entry please try again");
			System.exit(0);
		}
	
}}
