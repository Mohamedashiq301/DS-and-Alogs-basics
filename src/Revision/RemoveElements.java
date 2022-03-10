package Revision;

public class RemoveElements {

	public static void main(String[] args) {
		int num[]= {3,2,2,3};
		int val=3;
		int count=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]!=val) {
				count++;
			}
		}
		System.out.println(count);
		
		int nums[]= {1,2,3,4,5,6,4,7,4,8};
		int val1=4;
		
		int [] nums1=new int[nums.length];
		
		
		for(int i=0,k=0;i<nums.length;i++) {
			if(nums[i]!=val1) {
				nums1[k]=nums[i];
				k++;
			}
		}
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
	}
}
