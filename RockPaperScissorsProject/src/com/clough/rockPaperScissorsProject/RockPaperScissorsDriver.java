package com.clough.rockPaperScissorsProject;

public class RockPaperScissorsDriver {

	public static void main(String[] args) {

		//private static RockPaperScissors ans;
		//int response = 0;
		String choice = "";
		//int answer;*/
		
		RockPaperScissors ans = new RockPaperScissors();
		
		System.out.println("Welcome to the Ultimate Rock Paper Scissors Game!\n");
		System.out.println("Enter one of the below responses to start the game:\n\n");
		System.out.println("Rock: 0\n\nPaper: 1\n\nScissors: 2\n");
		System.out.print("Enter selection: ");
		int userinput = ans.getResponse();
		
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
	

}
	
}
