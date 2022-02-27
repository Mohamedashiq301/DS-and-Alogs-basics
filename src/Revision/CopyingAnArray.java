package Revision;

public class CopyingAnArray {

	public static void main(String[] args) {
		int A[]= {8,5,2,13,15,9,10,6,4,11};
		int B[]=new int[10];
		
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+",");
		}
	}
}
