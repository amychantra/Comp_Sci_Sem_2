package pkg;
import java.util.Scanner;
import java.util.Random;
class dog {
	String name;
	String breed; 
	int age;
	public dog() {
		name = "Clifford";
		breed = "big red dog";
		age = 3;
	}
	public dog(String a){
		name = a;
		breed = "dog dog";
		age = 1;
	}
	public dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public dog(String a, int c){
		name = a;
		age = c;
		breed = "dog dog";
	}
	public void setName(String a){
		name =a;
		return;
	}
	public void setAge(int c){
		age = c;
		return;
	}
	public void setBreed(String b){
		breed = b;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int five = rand.nextInt(2);
		if(five == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(+name+" barks!");
		return;
	}
}
	




