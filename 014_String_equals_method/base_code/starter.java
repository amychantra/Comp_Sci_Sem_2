import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would like a be a Wizard, Warrior, or a Rogue?");
		String one = sc.nextLine();
		if (one.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(one.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(one.equals("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else 
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
	}
}
