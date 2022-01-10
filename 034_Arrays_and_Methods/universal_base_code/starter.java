import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter{
public static void toStringArray(int [] x){
	int[] one = x;
	int c=0;
	while(c<one.length){
		System.out.println(one[c]);
		c++;
	}
	return;
}
public static int getArrayAverage(int [] x){
		int[] one= x;
		int z;
		int avg=0;
		for(z=0; z<one.length; z++){
			avg= avg+ one[z];
		}
		int ave2 = avg / one.length;
		return ave2;
}
public static int getArrayMax(int [] x){
		int [] one= x;
		int b=0;
		int max = 0;
		while(b<one.length){
			if(one[b]>max){
				max=one[b];
			}
			b++;
}
		return max;
}
public static int getArrayMin(int [] x){
		int [] one= x;
		int f=0;
		int min=100;
		while(f<one.length){
			if(one[f]<min){
				min= one[f];
			}
			f++;
		}
		return min;
}

	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int[] carrot = new int[100];
	int c = 0;
	while(c<carrot.length){
		int a = 1 + rand.nextInt(100);
		carrot[c]=a;
		c++;
		}
	toStringArray(carrot);
	System.out.println("The average is "+getArrayAverage(carrot));
	System.out.println("The maximum is "+getArrayMax(carrot));
	System.out.println("The minimum is "+getArrayMin(carrot));


		
	}
}
