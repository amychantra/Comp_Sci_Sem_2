import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int one = sc.nextInt();
		System.out.println("Enter another number.");
		int two = sc.nextInt();
		System.out.println("Enter one more number.");
		int three = sc.nextInt();
		if ((one>two) && (one>three))
		{
			System.out.println("Your first number is the largest of three!");
			System.out.println("The number was " +one+ ".");
		}
		if ((two>one) && (two>three))
		{
			System.out.println("Your second number is the largest of three!");
			System.out.println("The number was " +two+ ".");
		}
		if ((three>one) && (three>two))
		{
			System.out.println("Your third number is the largest of three!");
			System.out.println("The number was " +three+ ".");
		}
		if((one<two) && (one<three))
		{
			System.out.println("Your first number is the smallest of three!");
			System.out.println("The number was " +one+ ".");
		}
		if((two<one) && (two<three))
		{
			System.out.println("Your second number is the smallest of three!");
			System.out.println("The number was " +two+ ".");
		}
		if ((three<one) && (three<two))
		{
			System.out.println("Your third number is the smallest of three!");
			System.out.println("The number was " +three+ ".");
		}
		
	}
}
