package com.wkw.leetcode;

import java.util.PriorityQueue;

public class LeetCode155 {

}
class MinStack {

	private int[] array;
//	private int min;
	private PriorityQueue<Integer> min;
	private int size;
	private int index;
    /** initialize your data structure here. */
    public MinStack() {
        size = 16;
        index = 0;
//        min = Integer.MAX_VALUE;
        min = new PriorityQueue<>();
        array = new int[size];
    }
    
    public void push(int x) {
        
    	if (index == size - 1) {
    		size *=2;
    		int[] temp = new int[size];
    		int old = size / 2;
    		for (int i = 0; i < old; i++) {
    			temp[i] = array[i];
    		}
    		
    		array = temp;
    		
    	}
    	
    	array[index++] = x;
    	min.add(x);
//    	if (min > x) {
//    		min = x;
//    	}
    }
    
    
    public void pop() {
    	if (array.length <= 0) {
    		return ;
    	}
    	int temp = array[--index];
    	if (temp == getMin()) {
    		min.poll();
    	}
    }
    
    public int top() {
        if (array.length <= 0) {
        	return Integer.MIN_VALUE;
        }
        return array[index-1];
    }
    
    public int getMin() {
    	return min.peek();
    }
}