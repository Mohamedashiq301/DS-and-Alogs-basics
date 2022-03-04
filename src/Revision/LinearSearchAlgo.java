package Revision;

public class LinearSearchAlgo {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int length = 7;
		int element = 9;

		for (int i = 0; i < length; i++) {
			if (array[i] == element) {
				System.out.println("Element present in the " + i + "th " + "index");
				System.out.println("True");
			}
		}
		System.out.println("Element not found");
	}
}