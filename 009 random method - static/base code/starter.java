import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int one = rand.nextInt(10);
		System.out.println("A number between 0 and 9: "+ one +"");
		int two = 1 + rand.nextInt(100);
		System.out.println("A number between 1 and 100: "+ two +"");
		double three = 2.5 + rand.nextDouble();
		System.out.println("A number between 2.5 and 3.5: "+ three +"");
		int four = 14 + rand.nextInt(575);
		double five = rand.nextDouble();
		System.out.println("A double between 14 and 589: " +(four + five)+"");
		
	}
}
