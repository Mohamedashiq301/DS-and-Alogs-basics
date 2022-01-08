package HumanDemo;

public class PlanetEarth {
	public static void main(String[] args) {
		Humans human1=new Humans("Ashiq",26,5,"black");
		Humans human2=new Humans("Jaffer",26,6,"brown");
		Humans human3=new Humans("Hamith",25,5,"blue");
		
		human1.speak();
		human2.speak();
		human3.speak();
		
		human1.eat();
		human2.eat();
		human3.eat();
		
		human1.walking();
		human2.walking();
		human3.walking();
	}
}
class Humans {
	String name;
	int age;
	int HeightInInches;
	String EyeColor;
	
	public Humans(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		HeightInInches = heightInInches;
		EyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello I am "+name);
		System.out.println("I am "+age+" old");
		System.out.println("My height is "+HeightInInches+" in inches");
		System.out.println("And my etecolor is "+EyeColor);
	}
	
	public void eat() {
		System.out.println(name+" ,i am eating");
	}
	
	public void walking() {
		System.out.println(name+" ,i am walking");
	}
}
