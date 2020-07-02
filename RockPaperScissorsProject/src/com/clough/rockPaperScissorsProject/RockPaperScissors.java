package com.clough.rockPaperScissorsProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class RockPaperScissors {

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	private int response;
	private String choice;
	private List<String> answers;
	private int rock = 0;
	private int paper = 1;
	private int scissors = 2;
	private String result;
	private int answer;
	
	//private Array answers;
	//answers = {0, 1, 2};
	
	public RockPaperScissors() {
		answers = new ArrayList<String>();
		answers.add("Rock");
		answers.add("Paper");
		answers.add("Scissors");
	}

	public int getResponse() {
		boolean res;
		int response = input.nextInt();
		//int response = 0;
		//System.out.println(response);
		/*if(response == 0){
			System.out.println("True");
			return true;
			
		}
		else {
			return false;
		}*/
		return response;
		}

	public int getAnswer() {
		int answer = rand.nextInt(scissors);
		//System.out.println(answer);
		return answer;
	}

	public String getResult(int response, int answer) {
		//int answer = 0;
		//int response = 1;
		if(answer==response) 
			result = "It's a draw!!";
					
		else if(answer == rock) {
			if(response == paper) result = "You win! Paper covers rock";
			
			else if (response == scissors)
			
				result = "You lose! Rock smashes scissors";
				}
		else if(answer == paper) {
			if(response == rock) result = "You lose! Paper covers rock";
			
			else if (response == scissors)
			
				result = "You win! Scissors cut paper";
				}
		else if(answer == scissors) {
			if(response == rock) result = "You win! Rock smashes scissors";
			
			else if (response == paper)
			
				result = "You lose! Scissors cut paper";
				}
		else  {
			
				result = "Your entry was invalid";
		}
			
		System.out.println(result);
		return result;
	}
}
	


