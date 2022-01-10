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
		if(one == two) 
		{
		System.out.println("The variables are the same.");
		}	 
		if(one != two)
		{
			System.out.println("The variables are different.");
		}
	}
}
