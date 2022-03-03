package Revision;

public class RemoveElement {

	public static void main(String[] args) {
		int c[]= {3,2,2,3};
		int val = 3;
		int i=0;
		int j=c.length;
		
		while(i<j) {
			if(c[i]==val) {
				c[i]=c[j-1];
				j--;
			}else {
				i++;
			}
		}
		System.out.println(i);
	}
}