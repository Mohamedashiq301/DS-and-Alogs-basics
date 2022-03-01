package Revision;

public class DeletionOfFirstElement {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		int length=0;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println("");
		for(int i=1;i<arr1.length;i++) {
			arr1[i-1]=arr1[i];
		}
		length--;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
	}
}
