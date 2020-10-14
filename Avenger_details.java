import java.util.Scanner;

public class Avenger_details {

	public static void main(String[] args) {
		Avenger x=new Avenger();
		x.getDetails();
		x.displayDetails();
	}
}
class Avenger
{
	String name;
	int age;
	int power;
	String weapon;
	String planet;
	
public void getDetails()
	{
	System.out.println("Enter Avenger Name, Age, Power, Weapon, Planet");
	Scanner kb=new Scanner(System.in);
	name=kb.next();
	age=kb.nextInt();
	power=kb.nextInt();
	weapon=kb.next();
	planet=kb.next();
	}
public void displayDetails()
	{
	System.out.println("The Avenger Details are");
	System.out.println("Name: "+name+"\nAge: "+age+"\nPower: "+power+"\nWeapon: "+weapon+"\nPlanet: "+planet);
	}	
}