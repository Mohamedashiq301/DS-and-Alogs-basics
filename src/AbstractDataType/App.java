package AbstractDataType;

public class App {

	public static void main(String[] args) {
		Counter mycounter=new Counter("MyCounter");
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		
		
		System.out.println(mycounter.getCurrentValue());
		System.out.println(mycounter.toString());
	}
}
