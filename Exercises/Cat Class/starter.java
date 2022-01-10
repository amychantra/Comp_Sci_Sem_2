import java.util.Scanner;
import java.util.Random;
class cat {
	String name;
	public cat(){
		name = new String("Garfield");
	}
	
	public cat(String a){
		name = a;
	}
	
	public void meow(){
		System.out.println("The cat's name is " +name+ " and he meows.");
		return;
	}
}
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	cat test = new cat();
	test.meow();
	cat one = new cat("Banana");
	one.meow();
	}
}
	

