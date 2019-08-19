package com.wkw.leetcode;

public class LeetCode121 {

	public static int maxProfit(int[] prices) {
	    int result = 0;
	    int buy = Integer.MAX_VALUE;
	    for (int price:prices) {
	    	
	    	
	    	buy = Math.min(buy, price);
	    	result = Math.max(result, price-buy);
	    }
	    
	    return result;
    }
	
	public static void main(String[] args) {
		
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}
}
