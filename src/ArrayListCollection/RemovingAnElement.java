package ArrayListCollection;

import java.util.ArrayList;

public class RemovingAnElement {

	public static void main(String[] args) {
		ArrayList<Integer> al4 = new ArrayList<Integer>();

		al4.add(11);
		al4.add(12);
		al4.add(13);
		al4.add(14);
		al4.add(15);

		System.out.println(al4);

		al4.remove(1);
		System.out.println(al4);

		int val = 14;
		for (int i = 0; i < al4.size(); i++) {
			if (al4.get(i).equals(val)) {
				al4.remove(i);
			}
			
		}
		System.out.println(al4);
	}
}
