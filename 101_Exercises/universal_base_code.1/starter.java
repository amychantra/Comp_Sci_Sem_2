import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	int[] one;
	public int getMode(int[] arr){
		int[] arr = one;
		int mode = 0;
		for(int x=0; x<arr.length-1; x++){
			if(arr[x]==arr[x+1]){
			mode = arr[x];	
			}
		}
		return mode;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr1 = {2,7,4,3,8,5,5,3,5,6};
		int[] arr2 = {2,7,9,7,1,7,2,8,2};
		int[] arr3 = {2,6,4,5,3,8,9,1};
		int mode1 = arr1.getMode();
		int mode2 = arr2.getMode();
		int mode3 = arr3.getMode();


		
	}
}
