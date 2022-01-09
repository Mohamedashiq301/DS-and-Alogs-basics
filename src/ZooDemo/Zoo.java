package ZooDemo;

public class Zoo {

	public static void main(String[] args) {
		Animal lion=new Animal(3,100,"male");
		Animal tiger=new Animal(4,120,"female");
		
		lion.speak();
		tiger.speak();
		
		lion.eat();
		tiger.sleeping();
		
		System.out.println("********************");
		Bird bird1=new Bird();
		bird1.fly();
		
		Fish fish1=new Fish();
		fish1.swim();
	}
}
