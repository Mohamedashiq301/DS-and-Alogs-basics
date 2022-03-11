package ArrayListCollection;

import java.util.ArrayList;

public class ArrayManipulation {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		
//		for(int i=0;i<al1.size();i++) {
//			System.out.println(al1.get(i));
//		}
		
		System.out.println(al1);
		
		
		ArrayList<Integer> al2= new ArrayList<Integer>(){
			{
				add(1);
				add(2);
				add(3);
				add(4);
			}
		};
		
		System.out.println(al2);
		
		
		ArrayList<String> al3=new ArrayList<String>() {
			{
				add("Ashiq");
				add("Mohamed");
			}
		};
		
		System.out.println(al3);
	}
}
