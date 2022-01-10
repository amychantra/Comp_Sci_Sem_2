import java.util.Scanner;
import java.util.Random;
class starter {
	public static String mult(int a, int b){
		int x = a;
		int y = b;
		int prod = x*y;
		if(((x*y) % 3) == 0)
		{
			return("It is divisible by 3.");
		}
		else
		{
			return("It is not divisible by 3.");
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number.");
		int a = sc.nextInt();
		System.out.println("Input another number.");
		int b = sc.nextInt();
		System.out.println(mult(a,b));
		
	}
}
