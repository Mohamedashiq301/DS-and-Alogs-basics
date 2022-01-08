package HumanDemo;

public class Human {

	String name;
	int age;
	int HeightInInches;
	String EyeColor;
	
	public Human() {
		
	}
	
	public void speak() {
		System.out.println("Hello,My name is "+name);
		System.out.println("I am "+age+" years old");
		System.out.println("My height is "+HeightInInches+ " inches");
		System.out.println("And my eyecolor is "+EyeColor);
	}
	public void eat() {
		System.out.println("I am eating");
	}
	public void walk() {
		System.out.println("I am walking");
	}
}
