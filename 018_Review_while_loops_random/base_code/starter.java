import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000.");
	int guess = sc.nextInt();
	
	Random rand = new Random();
	int secret = 1 + rand.nextInt(1000);
	
	while(true)
	{
		if(guess != secret){
			if(guess < secret){
			System.out.println("Guess again. Your guess is too low.");
			guess = sc.nextInt();
			}
			else if(guess > secret){
			System.out.println("Guess again. Your guess is too high.");
			guess = sc.nextInt();
			}
		}
		else{
			System.out.println("You guess correctly! You won!");
			break;
		}
	}
		
	}
		
	}
