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
				//��Щ�ŷ�������Ҫ��
				result[row] = column;//��row������ �ŵ���column��
				cal8queue(row+1);//������һ��
			}
		}
	}

	private boolean isOk(int row, int column) {
		//�ж�row�� column �� �Ƿ����
		int 
		return false;
	}

	private void printQueue(int[] result2) {
		// TODO Auto-generated method stub
		
	}
}
