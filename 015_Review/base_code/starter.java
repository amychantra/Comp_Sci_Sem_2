import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
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
		System.out.println("You have 25 skills points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int a = 0;
		int b = 10;
		int c = 25;
		System.out.println("Strength (1-10):");
		int d = sc.nextInt();
		if((d>b) || (d>c))
		{
			System.out.println("Please input a smaller number.");
			break;
		}
		else 
		{
			System.out.println("You have " +(c-d)+ " left to spend.");
		}
		System.out.println("Dexterity (1-10):");
		int e = sc.nextInt();
		if((e>b) || ((d+e)>c))
		{
			System.out.println("Please input a smaller number.");
		}
		else 
		{
			System.out.println("You have " +(c-(d+e))+ " left to spend.");
		}
		System.out.println("Intelligence (1-10):");
		int f = sc.nextInt();
		int g = c-(d+e+f);
		if ((d+e+f)>c)
		{
			System.out.println("Please input a smaller number.");
		}
		else
		{
			System.out.println("You have " +(g)+ " left to spend.");
		}
		System.out.println("Constitution (1-10):");
		int h = sc.nextInt();
		if((d+e+f+h)>c)
		{
			System.out.println("Please input a smaller number.");
		}
		else
		{
			System.out.println("You have " +(g-h)+ " left to spend.");
		}
		System.out.println("Charisma (1-10):");
		int i = sc.nextInt();
		if((d+e+f+h+i)>c)
		{
			System.out.println("Please input a smaller number.");
		}
		else
		{
			System.out.println("You have " +(g-(h+i))+ " to spend for next time.");
		}
		System.out.println("Strength - " +d);
		System.out.println("Dexterity - " +e);
		System.out.println("Intelligence - " +f);
		System.out.println("Constitution - " +h);
		System.out.println("Charisma - " +i);
		System.out.println("Good luck on your quest" +name);
	}
}
