package Revision.Array;

public class ArrayManipulation {

	public static void main(String[] args) {
		String str[]= {"Mohamed","Ashiq","Mechanical","Engineer"};
		
		String str1[]=new String[10];
		str1[1]="Ashiq";
		str1[2]="Ashiq";
		str1[3]="Ashiq";
		str1[4]="Ashiq";
		str1[5]="Ashiq";
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		
		int in1[]= {1,2,3,4,5,6};
		for(int i=0;i<in1.length;i++) {
			System.out.println(in1[i]);
		}
		
		int in2[]=new int[10];
		in2[0]=1;
		in2[1]=2;
		in2[2]=3;
		in2[3]=4;
		in2[4]=5;
		in2[5]=6;
		in2[6]=7;
		in2[7]=8;
		in2[8]=9;
		in2[9]=10;
		
		for(int i=0;i<in2.length;i++) {
			System.out.println(in2[i]);
		}
		
		
	}
}
