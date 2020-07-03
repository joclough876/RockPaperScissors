package com.clough.rockPaperScissorsProject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	private int rock = 0;
	private int paper = 1;
	private int scissors = 2;
	private String result;

    public int getResponse() {
		int response = input.nextInt();
		return response;
		}

	public int getAnswer() {
		int answer = rand.nextInt(scissors + 1);
		return answer;
	}

	public String getResult(int response, int answer) {
		if(answer==response) 
			result = "It's a draw!!";
					
		else if(answer == rock) {
			if(response == paper) result = "You win! Paper covers Rock";
			
			else if (response == scissors)
			
				result = "You lose! Rock smashes Scissors";
				}
		else if(answer == paper) {
			if(response == rock) result = "You lose! Paper covers Rock";
			
			else if (response == scissors)
			
				result = "You win! Scissors cut Paper";
				}
		else if(answer == scissors) {
			if(response == rock) result = "You win! Rock smashes Scissors";
			
			else if (response == paper)
			
				result = "You lose! Scissors cut Paper";
				}
		else  {
			
				result = "Your entry was invalid";
		}
			
		System.out.println(result);
		return result;
	}
}
	


