package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AdditionOfTwoSortedArray {

	public static void main(String[] args) {
		ArrayList<Integer> sr1=new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(5);
				add(7);
			}
		};
		
		ArrayList<Integer> sr2=new ArrayList<Integer>() {
			{
				add(2);
				add(4);
				add(6);
				add(3);
			}
		};

		sr1.addAll(sr2);
		Collections.sort(sr1);
		
		System.out.println(sr1);
		
	}
}
