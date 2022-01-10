import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000.");
		int one = sc.nextInt();
		Random rand = new Random();
		int random1 = rand.nextInt(1000) + 1;
		if(one == random1)
		{
			System.out.println("Your guess is correct!");
		}
		else
		{
			System.out.println("Your guess is incorrect.");
		}
	}
}
