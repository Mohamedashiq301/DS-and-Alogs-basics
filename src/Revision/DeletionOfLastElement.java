package Revision;

public class DeletionOfLastElement {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int length = 0;

		for (int i = 0; i < 6; i++) {
			arr[length] = i;
			length++;
		}
		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + arr[i]);
		}

		System.out.println(" ");

		length--;
		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + arr[i]);
		}

		for (int i = 1; i < length; i++) {
			arr[i - 1] = arr[i];
		}
		length--;

		System.out.println("");
		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + arr[i]);
		}

		System.out.println("");

		for (int i = 2; i < length; i++) {
			arr[i - 1] = arr[i];
		}
		length--;

		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + arr[i]);
		}
	}
}
