import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int x = sc.nextInt();
		System.out.println("Enter another number.");
		int y = sc.nextInt();
		if(x%2 == 0)
		{
			System.out.println("Your first number is even.");
		}
		else
		{
			System.out.println("Your first number is odd.");
		}
		if(y%2 == 0)
		{
			System.out.println("Your second number is even.");
		}
		else
		{
			System.out.println("Your second number is odd.");
		}
		if(x%3 == 0)
		{
			System.out.println("Your first number is divisible by 3.");
		}
		else
		{
			System.out.println("Your first number is not divisible by 3.");
		}
		if(y%3 == 0)
		{
			System.out.println("Your second number is divisible by 3.");
		}
		else 
		{
			System.out.println("Your second number is not divisible by 3.");
		}
		if(x%4 == 0)
		{
			System.out.println("Your first number is divisible by 4.");
		}
		else
		{
			System.out.println("Your first number is not divisible by 4.");
		}
		if(y%4 == 0)
		{
			System.out.println("Your second number is divisible by 4.");
		}
		else 
		{
			System.out.println("Your second number is not divisible by 4.");
		}
		if(x%5 == 0)
		{
			System.out.println("Your first number is divisible by 5.");
		}
		else 
		{
			System.out.println("Your first number is not divisible by 5.");
		}
		if(y%5 == 0)
		{
			System.out.println("Your second number is divisible by 5.");
		}
		else
		{
			System.out.println("Your second number is not divisible by 5.");
		}
	}
}
