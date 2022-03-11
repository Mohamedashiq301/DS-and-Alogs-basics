package Revision.Array;

import java.util.ArrayList;

public class RemovingaLastElement {

	public static void main(String[] args) {
		// Removing last element
		int in2[] = { 1, 2, 3, 4, 5, 6, 7 };
		int in3[] = new int[in2.length - 1];
		for (int i = 0; i < in2.length - 1; i++) {
			in3[i] = in2[i];
			System.out.println(in3[i]);
		}

		// removing a particular element

		int in4[] = { 11, 12, 13, 14, 15, 16, 17 };
		int in5[] = new int[in4.length - 1];
		int val = 15;

		for (int i = 0, j = 0; i < in4.length; i++) {
			if (in4[i] != val) {
				in5[j] = in4[i];
				j++;
			}
		}
		for (int i = 0; i < in5.length; i++) {
			System.out.println(in5[i]);
		}

	}
}
