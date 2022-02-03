package algo.recursion;

public class App {

	public static void main(String[] args) {
		reducebyOne(10);

	}
	
	public static void reducebyOne(int n) {
		if(n>=0) {
			reducebyOne(n-1);
		}
		System.out.println("Completed by "+n);
	}

}
