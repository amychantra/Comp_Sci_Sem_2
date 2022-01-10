import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter one = new myCharacter();
		one.myToString();
		System.out.println("What class would you like to be?");
		String a = sc.nextLine();
		myCharacter two = new myCharacter(a);
		two.check();
		two.myToString();
		


		
	}
}
