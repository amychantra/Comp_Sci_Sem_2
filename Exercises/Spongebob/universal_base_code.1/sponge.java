import pkg.*;
import java.util.Scanner;
import java.util.Random;


class sponge {
	public static void main(String args[]) {
		// Your code goes below here
		File text = new File("./words.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner sc = new Scanner(words);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            
            for(int i = 0; i<line.length; i++){
            	String letter = line.substring(i,i+1);
            	if(i%2 == 0){
            		letter.toLowerCase();
            	}
            	else{
            		letter = letter.toUpperCase();
            	}
            	System.out.print(letter);
            	}
            	System.out.println();
       }
       
}
}
