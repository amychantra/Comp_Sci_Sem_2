import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] x = new int[1000];
		int y;
		for(y= 0; y<1000; y++){
			int a = 1+ rand.nextInt(1000);
			x[y] = a;
		}
		y=0;
		while(y<1000){
			System.out.println(x[y]);
			y++;
		}
		


		
	}
}
