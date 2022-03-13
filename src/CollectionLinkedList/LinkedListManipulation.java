package CollectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListManipulation {

	public static void main(String[] args) {
		LinkedList<Integer> ll1=new LinkedList<Integer>() {
			{
				add(11);
				add(12);
				add(13);
				add(14);
				add(15);
				add(16);
			}
		};
		
		System.out.println(ll1);
		
		
		List<Integer> ll2=new ArrayList<Integer>() {
			{
				add(11);
				add(12);
				add(13);
				add(14);
				add(15);
				add(16);
			}
		};
		System.out.println(ll2);
		
		List<Integer> ll3=new LinkedList<Integer>() {
			{
				add(11);
				add(12);
				add(13);
				add(14);
				add(15);
				add(16);
			}
		};
		System.out.println(ll3);
	}
}
