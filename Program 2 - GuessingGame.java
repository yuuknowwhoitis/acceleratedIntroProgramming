//GuessingGame.java
//Jason Yu
//1602944
//Guessing Game
//Game where user has three tries to guess randomly generated integer from 1 to 10

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the number guessing game. What is your name?");
		String name = console.nextLine();
		System.out.println("");
		int answer = new Random().nextInt(11);
		int first;
		int second;
		int third;
		
		System.out.println("I'm thinking of an integer between 1 and 10. You have three guesses.");
		System.out.println("");
		for(int i = 0; i < 3; i++){
			
			if(i == 0){
				System.out.print("Your first guess: ");
			}
			else if(i == 1){
				System.out.print("Your second guess: ");
			}
			else if(i == 1){
				System.out.print("Your third guess: ");
			}
			
			first = console.nextInt();
			if(first == answer){
				if(i == 0){
					System.out.println("Congratulations " + name + "! You won in " + (i+1) + " guess.");
					break;
				}
				else {
					System.out.println("Congratulations " + name + "! You won in " + (i+1) + " guesses.");
					break;
				}
				}
				
			
			else if(i == 2){
				System.out.println("Game over " + name + ", you lose.");
			}
			else if(first < answer){
				System.out.println("Too low, guess higher.");
				System.out.println("");
			}
			else if(first > answer){
				System.out.println("Too high, guess lower");
				System.out.println("");
			}
			
		}
		}
	}


