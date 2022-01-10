
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
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("What would you like to name your dog?");
	String a = sc.nextLine();
	System.out.println("How old would you like him/her to be?");
	int c = sc.nextInt();
	dog d = new dog(a,c);
	dog e = new dog("Juno", "dachshund");
	boolean x = d.isSleeping();
	boolean y = e.isSleeping();
	System.out.println(d.getName()+" is a "+d.getBreed()+" that is "+d.getAge()+" years old.");
	System.out.println(e.getName()+" is a "+e.getBreed()+" that is "+e.getAge()+" years old.");
	if(x == true){
		System.out.println(a+" is sleeping!");
	}
	else{
		System.out.println(a+" is awake.");
		d.bark();
	}
	if((y == true) && (x == false)){
		System.out.println("Juno is sleeping!");
		System.out.println("Juno hears "+a);
		e.bark();
	}
	else if((y == false) && (x == false)){
		System.out.println("Juno is not asleep.");
		e.bark();
	}
	}
}

