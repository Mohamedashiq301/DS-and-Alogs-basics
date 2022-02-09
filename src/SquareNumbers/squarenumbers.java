package SquareNumbers;

public class squarenumbers {

	public static void main(String[] args) {
		int []squarenumbers=new int [15];
		
		for(int i=0;i<15;i++) {
			int square=(i+1)*(i+1);
			squarenumbers[i]=square;
		}
		
		for(int i=0;i<15;i++) {
			System.out.println(squarenumbers[i]);
		}
		int capacity = squarenumbers.length;
		System.out.println("The Array has a capacity of " + capacity);
	}
}
