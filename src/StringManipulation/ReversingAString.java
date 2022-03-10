package StringManipulation;

public class ReversingAString {

	public static void main(String[] args) {
		String str13="MohamedAshiq";
		String str14="";
		
		
		char ch1[]=str13.toCharArray();
		for(int i=ch1.length-1;i>=0;i--) {
			str14=str14+ch1[i];
		}
		System.out.println(str14);
	}
}
