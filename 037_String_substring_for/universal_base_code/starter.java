import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String a = sc.nextLine();
		a.length();
		for(int c=0; c<a.length(); c++){
			System.out.print(c+" ");
			System.out.println(a.substring(c,c+1));
		}


		
	}
}
