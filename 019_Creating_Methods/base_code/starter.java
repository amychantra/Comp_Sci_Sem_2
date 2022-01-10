import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
		String x = a;
		System.out.println(x);
		return;
	} 
	public static void toStringCombined(String a, String b){
		String x = a;
		String y = b;
		System.out.println(x+ " " +y);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		toString("Write a sentence!");
		String x = sc.nextLine();
		toString("Write another sentence");
		String y = sc.nextLine();
		toStringCombined(x,y);
		
	
		


		
	}
}
