package Practice;

public class practice {

	 public static void main(String[] args) {
	        // We need to just a kick start 
	        //Short Jar. We are having jar with max capacity -32768 to 32767
	        Short shortVariable = -32768;
	        System.out.println("Short Value!" + shortVariable.SIZE); 
	        
	        //Int Jar. We are having jar with max capacity -2147483648 to +2147483647
	        Integer intValue = -2147483648;
	        System.out.println(" Int Value" + intValue.toString().length());
	        
	        
	        String stringValue = "Masha Allah";
	        System.out.println("String value "+stringValue);
	        System.out.println("String value "+stringValue.length());
	        
	        
	        New variable=new New();
	        System.out.println(variable.age);
	        variable.age=15;
	        variable.age(variable.hashCode());
	       
	        //System.out.println(variable.age);
	 }
}

class New{
	int age =0;
	
	public void age(int age) {
		System.out.println(age);
	}
}
