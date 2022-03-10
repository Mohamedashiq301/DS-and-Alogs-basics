package Revision;

public class Palindrome {

	public static void main(String[] args) {
		int palin=4541;
		
		String str=String.valueOf(palin);
		System.out.println(str);
		
		char ch[]= str.toCharArray();
		System.out.println(ch[2]);
		for(int i=ch.length;i>=0;i--) {
			String str1=String.valueOf(ch[i]);
			System.err.println(str1);
		}
		
//		String palin1="234";
//		int in1=Integer.valueOf(palin1);
		
//		StringBuilder sb =new StringBuilder(String.valueOf(palin));
//		sb = sb.reverse();
//		System.out.println(sb);
//		
//		int temp = Integer.valueOf(sb);
		
		
	
	}
}
