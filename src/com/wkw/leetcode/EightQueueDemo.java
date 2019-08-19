package com.wkw.leetcode;

public class EightQueueDemo {

	int[] result = new int[8];
	
	public void cal8queue(int row) {
		if (row == 8) {
			printQueue(result);
			return;
		}
		
		for (int column = 0; column < 8; column++) {
			if (isOk(row, column)) {
				//有些放法不满足要求
				result[row] = column;//第row行旗子 放到了column列
				cal8queue(row+1);//考察下一行
			}
		}
	}

	private boolean isOk(int row, int column) {
		//判断row行 column 列 是否合适
		int 
		return false;
	}

	private void printQueue(int[] result2) {
		// TODO Auto-generated method stub
		
	}
}
