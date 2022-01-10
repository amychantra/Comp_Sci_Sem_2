import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] one = new int[100];
		System.out.println("There are 100 integers.");
		int min = 100;
		int c = 0;
		while(c<one.length){
		int a = 1 + rand.nextInt(100);
		one[c]=a;
		c++;
		}
		c=0;
		while(c<one.length){
			if(one[c]<min){
				min= one[c];
			}
			c++;
		}
		System.out.println("The minimum of 100 numbers is " +min);
		c=0;
		int max = 0;
		while(c<one.length){
			if(one[c]>max){
				max=one[c];
			}
			c++;
		}
		System.out.println("The maximum of 100 numbers is "+max);
		c=0;
		int avg=0;
		for(c=0; c<one.length; c++){
			avg= avg+ one[c];
		}
		int ave2 = avg / one.length;
		System.out.println("The average of 100 numbers is "+ave2);


		
	}
}
