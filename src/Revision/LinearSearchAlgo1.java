package Revision;

public class LinearSearchAlgo1 {

	public static void main(String[] args) {
		int array1 []=new int[6];
		
		int length=0;
		
		for(int i=0;i<6;i++) {
			array1[length++]=i;
			System.out.println(i);
		}
		
		System.out.println("Does the array contain the element 4? - " + LinearSearchAlgo1.linearSearch(array1, length, 1));
        System.out.println("Does the array contain the element 30? - " + LinearSearchAlgo1.linearSearch(array1, length, 30));
		
	}
	
	public static Boolean linearSearch(int array1 [],int length,int element) {
		if(array1==null || length==0) {
			return false;
		}
		
		for(int i=0;i<length;i++) {
			if(array1[i]==element) {
				return true;
			}
		}
		return false;
	}
}
