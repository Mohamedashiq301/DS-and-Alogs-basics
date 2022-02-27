package Revision;

public class InsertingAnElementInAnArray {

	public static void main(String[] args) {
		int A[]=new int[10];
		
		A[0]=3;
		A[1]=9;
		A[2]=7;
		A[3]=12;
		A[4]=14;
		A[5]=8;
		
		int n=6;
		
		for(int i=0;i<A[i];i++) {
			System.out.print(A[i]+",");
		}
		System.out.println("");
		
		int x=20;
		int index=2;
		
		for(int i=n;i>index;i--) {
			A[i]=A[i-1];
			A[index]=x;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+",");
		}
		
		
		
		
		
		System.out.println(" ");
		int[] intArray = new int[6];
		int length = 0;

		// Add 3 elements to the Array
		for (int i = 0; i < 3; i++) {
		    intArray[length] = i;
		    length++;
		}
		for (int i = 0; i < intArray.length; i++) {
		    System.out.println("Index " + i + " contains " + intArray[i]);
		}
	}
}
