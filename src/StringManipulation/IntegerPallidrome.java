package StringManipulation;

public class IntegerPallidrome {

	public static void main(String[] args) {
		int val=454;
		
		String str16=String.valueOf(val);
		String str17=new String();
		char ch1[]=str16.toCharArray();
		
		for(int i=ch1.length-1;i>=0;i--) {
			//System.out.println();
			str17=str17+ch1[i];
		}
		if(str17.equals(str16)) {
			System.out.println("Its a pallindrome");
		}else {
			System.out.println("Its not a palllindrome");
		}
		
	}
}
