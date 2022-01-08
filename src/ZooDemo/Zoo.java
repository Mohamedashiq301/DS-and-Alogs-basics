package ZooDemo;

public class Zoo {

	public static void main(String[] args) {
		Animal lion=new Animal(3,100,"male");
		Animal tiger=new Animal(4,120,"female");
		
		lion.speak();
		tiger.speak();
		
		lion.eat();
		tiger.sleeping();
	}
}
