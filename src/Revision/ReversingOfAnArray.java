package Revision;

public class ReversingOfAnArray {

	public static void main(String[] args) {
		
		int A[]= {8,5,2,13,15,9,10,6,4,11};
		int B[]=new int[10];
		
		
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+",");
		}
		System.out.println("");
		for(int i=A.length-1,j=0;i>=0;i--,j++) {
			B[j]=A[i];
		}
		
		for(int j=0;j<B.length;j++) {
			System.out.print(B[j]+",");
		}
	}
}
