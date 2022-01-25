package ds.stack1;

public class App {

	public static void main(String[] args) {
		Stack thestack = new Stack(5);
		System.out.println(reverseString("HELLO"));
	}
	
	public static String reverseString (String str) {
		int stacksize = str.length();
		Stack thestack =new Stack(stacksize);
		for(int j=0;j<str.length();j++) {
			char ch= str.charAt(j);
			thestack.push(ch);
		}
		String result="";
		while(!thestack.isEmpty()) {
			char ch =thestack.pop();
			result=result+ch;
		}
		return result;
		
	}

}
