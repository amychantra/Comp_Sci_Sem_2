import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int one = 13 - 6 * 11;
		int two = 30 % 7 * (-2);
		double three = 3 * 8 + 31 % 7;
		double four = 37 / 3;
		double five = 35 % 21;
		double six = 2;
		double seven = 14 % 3;
		double eight = 2*6;
		System.out.println("Maximum = " + Math.max(one,two));
		System.out.println("Square root = " + Math.sqrt(three));
		System.out.println("Power = " + Math.pow(four,five));
		System.out.println("Max = " + Math.max(Math.pow(six, seven), Math.sqrt(eight)));
		
		
	}
}
