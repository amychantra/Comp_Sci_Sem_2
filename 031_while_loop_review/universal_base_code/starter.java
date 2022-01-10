import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int y = 0;
		while(y<101){
			int a = 1+ rand.nextInt(100);
			System.out.println(a);
			y++;
		}


		
	}
}
