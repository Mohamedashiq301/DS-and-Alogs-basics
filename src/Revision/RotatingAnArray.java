package Revision;

public class RotatingAnArray {

	public static void main(String[] args) {
		int A[]= {5,6,7,8,1,2,10,12,4,15};
		
		int temp=A[0];
		
		for(int i=1;i<A.length;i++) {
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		
		for(int x:A) {
			System.out.print(x+",");
		}
	}
}
