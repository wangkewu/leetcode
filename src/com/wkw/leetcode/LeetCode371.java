package common.web.algorithm;

public class LeetCode371 {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1,1,2,2,4,2,4}));
		
		System.out.println(Integer.bitCount(3));
	}
	
	public static int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) 
			return 0;
		
		int temp = nums[0];
		for(int i = 1; i< nums.length; i++) {
			temp = temp ^ nums[i];
		}
		return temp;
	}
}
