import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times do you want your name outputted?");
	int number = sc.nextInt();
	int number2 = 1;
	while(true)
	{
		System.out.println(name);
		if(number == number2)
		{
			break;
		}
		number2 = number2 + 1;
	}


		
	}
}
