package Revision;

import java.util.ArrayList;
import java.util.List;

public class DuplicataZeros {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,3,0,4,5,0};
		
		List<Integer>list =new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				list.add(0);
				list.add(0);
			}else {
				list.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=list.get(i);
			System.out.print("[ "+arr[i]+" ]");
		}
	}
}
