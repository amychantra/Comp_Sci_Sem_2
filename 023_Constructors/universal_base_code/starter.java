import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter one = new myCharacter();
		one.check();
		System.out.println("What role would you like? Ex) Warrior, Wizard, or Rogue.");
		String a = sc.nextLine();
		myCharacter two = new myCharacter(a);
		two.check();
		

 
		
	}
}
