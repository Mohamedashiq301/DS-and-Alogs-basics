package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack thestack=new Stack(10);
		
		thestack.push(20);
		thestack.push(40);
		thestack.push(60);
		thestack.push(80);
		thestack.push(100);
		
		while(!thestack.isEmpty()) {
			long value=thestack.pop();
			System.out.println(value);
		}
		
	}
}
