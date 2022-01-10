import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int x = a;
		int y = b;
		int c = x;
		int z;
		int count = 1;
		while(true){
			y= y-1;
			z= x*c;
			if(y == count){
			break;
			}
			x=z;
		}
		return(z);
	}

	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int x = sc.nextInt();
	System.out.println("What is your power number?");
	int y = sc.nextInt();
	System.out.println("Your result is " + pow(x,y));


		
	}
}
