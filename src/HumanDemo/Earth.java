package HumanDemo;

public class Earth {
	public static void main(String[] args) {
		Human tom=new Human();
		tom.name="Ashiq";
		tom.age=26;
		tom.EyeColor="black";
		tom.HeightInInches=5;
		
		tom.speak();
		tom.walk();
		tom.eat();
		
		System.out.println("******************");
		Human Joa=new Human();
		Joa.name="Joa";
		Joa.age=22;
		Joa.EyeColor="brown";
		Joa.HeightInInches=6;
		
		Joa.speak();
		Joa.walk();
		Joa.eat();
	}

}
