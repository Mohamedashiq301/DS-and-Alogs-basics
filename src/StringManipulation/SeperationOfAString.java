package StringManipulation;

public class SeperationOfAString {

	public static void main(String[] args) {
		String str10="Mohamed";
		//String str11="Ashiq";
		
		String str11=str10.substring(0, 4);
		String str12=str10.substring(4, str10.length());
		System.out.println(str11);
		System.out.println(str12);
	}
}
