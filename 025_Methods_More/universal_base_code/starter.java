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
		two.myToString();
		two.setRole(a);
		System.out.println("How many points would you like in your strength trait?");
		int b = sc.nextInt();
		two.setStrength(b);
		System.out.println("How many points would you like in your dexterity trait?");
		int c = sc.nextInt();
		two.setDexterity(c);
		System.out.println("How many points would you like in your intelligence trait?");
		int d = sc.nextInt();
		two.setIntelligence(d);
		System.out.println("How many points would you like in your constitution trait?");
		int e = sc.nextInt();
		two.setConstituion(e);
		System.out.println("How many points would you like in your charisma trait?");
		int f = sc.nextInt();
		two.setCharisma(f);
		


		
	}
}
