package Revision;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int d[]= {0,0,1,1,1,2,2,3,3,3};
		
		int j=1;
		
		for(int i=0;i<d.length-1;i++) {
			if(d[i]!=d[i+1]) {
				d[j]=d[i+1];
				j++;
			}
		}
		System.out.println(j);
	}
}
