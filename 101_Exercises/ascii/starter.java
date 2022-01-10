import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii one = new Ascii();
		one.setType("Human");
		one.setName("Hannah");
		one.setNumber(5);
		one.setAscii("");
		one.printArt();
		
		Ascii two = new Ascii("cactus", 2);
		two.setName("Juno");
		two.printArt();
		
		Ascii three = new Ascii("dog", "Mochi");
		three.setNumber(1);
		three.printArt();
		
		Ascii four = new Ascii("Other");
		four.setAscii("(-_-)");
		four.printArt();
		
		Ascii five = new Ascii("hfan", 10);
		five.setType("hfan");
		five.setName("Hannah's Biggest fan");
		five.setNumber(10);
		five.printArt();
		
		


		
	}
}
