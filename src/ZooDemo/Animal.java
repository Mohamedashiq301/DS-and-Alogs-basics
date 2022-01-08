package ZooDemo;

public class Animal {

	int age;
	int weight;
	String gender;
	
public Animal(int age, int weight, String gender) {
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

public void speak() {
	System.out.println("The age is "+age);
	System.out.println("The weight of the animal is "+weight);
	System.out.println("And the gender of the animal is "+gender);
}

public void eat() {
	System.out.println("Eating...");
}
public void sleeping() {
	System.out.println("Sleeping...");
}
}
