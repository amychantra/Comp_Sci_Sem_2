import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		
		int c = 100;
		while(c>0){
			System.out.println("Would you like to play the slots?");
			String a = sc.nextLine();
			if((a.equals("Yes")) || (a.equals("yes")) || (a.equals("Y")) || (a.equals("y")))
			{
			System.out.println("You have $" +(c)+ ". How much would you like to wager?");
			int b = sc.nextInt();
			sc.nextLine();
			int one = 1 + rand.nextInt(10);
			int two = 1 + rand.nextInt(10);
			int three = 1 + rand.nextInt(10);
			System.out.println(one + " | " + two + " | " + three);
				if(((one == two) || (two == three) && (one != three)) || ((one == two) ||(one == three) && (two != three))|| ((one == three) || (two == three) && (one != two)))
				{
					c=c+b;
					System.out.println("You won!Your wager has now been doubled!");
					System.out.println("You now have $" + c);
				}
				else if((one == two) && (two == three))
				{
					c=c+(2*b);
					System.out.println("You won! Your wager has now been tripled!");
					System.out.println("You now have $" +c);
				}
				else
				{
					c=c-b;
					System.out.println("Didn't win this time. Better luck next time!");
					System.out.println("You now have $" + c);
				}
			}

			else if((a.equals("No")) || (a.equals("no")) || (a.equals("N")) || (a.equals("n")))
			{
				System.out.println("Sad to see you go! Come again soon! Thanks!");
				break;
			}
			else if(c <= 0)
				{
					System.out.println("You do not have any money left.");
					{
						break;
					}
				}
			else{
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		}
		
	}
}
