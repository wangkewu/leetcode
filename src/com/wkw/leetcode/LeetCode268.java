package common.web.algorithm;

public class LeetCode268 {
	
	public static int missingNumber(int[] nums) {
		int length = nums.length;
		int sum = (length+0)*(length+1)/2;
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
		}
		return sum;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
}
