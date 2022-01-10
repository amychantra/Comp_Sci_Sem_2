package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	public myCharacter(String a){
		role = a;
	}
	public myCharacter(){
		role = new String("no role");
	}
	public void setRole(String a){
		if(role.equals("Wizard"))
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
			System.out.println("Your role is no role");
		}
		return;
	}
	public int setStrength(int b){
		int x =b;
		return x;
	}
	public int setDexterity(int c){
		int y = c;
		return +y;
	}
	public int setIntelligence(int d){
		int z = d;
		return z;
	}
	public int setConstituion(int e){
		int w = e;
		return w;
	}
	public int setCharisma(int f){
		int v = f;
		return v;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		if(a.equals("Warrior") || a.equals("Wizard") || a.equals("Rogue")){
			return true;
		}
		else{
			return false;
		}
		}
		public void myToString(){
		System.out.println("Your role is "+role);
		System.out.println("Your strength trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your intelligence trait is 0");
		System.out.println("Your constitution trait is 0");
		System.out.println("Your charisma trait is 0");
		return;
	}
}


