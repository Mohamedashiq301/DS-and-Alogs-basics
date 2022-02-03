package algo.linearSearch;

public class App {

	public static void main(String[] args) {
		System.out.println(linearsearch(new int [] {1,2,3,4,5,6,12,15,18},20));
	}
	
	public static int linearsearch(int []a , int x) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}

}
