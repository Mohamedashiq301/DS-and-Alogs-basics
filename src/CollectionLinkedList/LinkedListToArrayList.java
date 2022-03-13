package CollectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> ls1=new LinkedList<String>() {
			{
				add("A");
				add("B");
				add("c");
				add("D");
				add("E");
				add("F");
			}
		};
		
		List<String> ls2=new ArrayList<String>(ls1);
		for(String x:ls2) {
			System.out.println(x);
		}
	}
}
