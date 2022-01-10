package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution; 
	int charisma;
	public void myToString(){
		System.out.println("Your role is "+role);
		System.out.println("Your strength trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your intelligence trait is 0");
		System.out.println("Your constitution trait is 0");
		System.out.println("Your charisma trait is 0");
		return;
	}
	public myCharacter(){
		role = new String("no role");
	}
	public myCharacter(String a){
		role = a;
	}
	public void check(){
		if (role.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else 
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		return;
	}
	

}

