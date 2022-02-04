package algo.recursion;

public class App {

	public static void main(String[] args) {
		reducebyOne(10);
		
		System.out.println("*****************");
		
		System.out.println(recursiveLinearSearch(new int[]{2, 48, 24,12,36,78,91,3}, 0, 91));
	}
	
	public static void reducebyOne(int n) {
		if(n>=0) {
			reducebyOne(n-1);
		}
		System.out.println("Completed by "+n);
	}
	
	public static int recursiveLinearSearch(int []a,int i,int x) {
		if(i>a.length -1) {
			return -1;
		}else if(a[i]==x) {
			return i;
		}else {
			System.out.println("index at: "+i);
			return recursiveLinearSearch(a, i+1, x);
		}
	}

}
