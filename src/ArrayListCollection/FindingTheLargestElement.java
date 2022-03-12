package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collections;

public class FindingTheLargestElement {

	public static void main(String[] args) {
		ArrayList<Integer> le1=new ArrayList<Integer>() {
			{
				add(9);
				add(12);
				add(13);
				add(7);
				add(3);
				add(18);
				}
		};
			Collections.sort(le1);
			System.out.println(le1);
			
			int element=le1.get(le1.size()-1);
			System.out.println(element);
			
			int element1=le1.get(0);
			System.out.println(element1);
	}
}
