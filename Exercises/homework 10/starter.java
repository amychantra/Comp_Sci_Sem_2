import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int[] one = new int[20];
	int c;
	System.out.println("There are 20 numbers.");
	for(c=0; c<20; c++){
		int a = rand.nextInt(10)+1;
		one[c] = a;
		System.out.print(a+ " ");
	}
	System.out.println(" ");
	System.out.println("-----------------------------------------");
	int b = rand.nextInt(10)+1;
	System.out.println("The number to look for is "+b);
	c=0;
	int d = 0;
	while(c<20){
		if(one[c] == b){
			System.out.println("Duplicate found at index "+c);
			d++;
		}
		c++;
	}
	System.out.println("Total number of duplicates for "+b+" is "+d);
	System.out.println("-----------------------------------------");
	c=0;
	while(c<19){
		if(one[c]==one[c+1]){
			int g=c+1;
			System.out.print("Two in a row found at indexes "+c+" and "+g+". ");
			System.out.println("The number was "+one[c]);
		}
		c++;
	}
}
}