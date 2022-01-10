import java.util.Scanner;
import java.util.Random;
class starter {
	public static boolean checkPrime(int a)
	{
		int x = a;
		int y = 2;
		while(y < a)
		{
				if(x % y == 0)
				{
					return false;
				}
				y= y+1;
		}
		
		return true;
	}
	
	public static void printPrime(int b)
	{
		int d = 2;
		while(d <= b)
		{
			if(checkPrime(d)){
				System.out.println(d);
			}
			d = d+1;
			if(b == d){
				break;
			}
		}
		return;
	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int x = sc.nextInt();
		//System.out.println(printPrime(x));
		printPrime(x);
	}
}
