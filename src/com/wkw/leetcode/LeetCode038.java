package common.web.algorithm;

import java.time.Instant;

public class LeetCode038 {

	public static String countAndSay(int n) {
	        
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "11";
		}
		String pre = "11";
		String resultStr = "";
		int i = 0;
		int j = 0;
		for (i = 3; i <= n; i++) {
			int count = 1;
			int length = pre.length();
			String str = "";
			resultStr = "";
			for (j = 1; j < length; j++) {
				System.out.println((String.valueOf(pre.charAt(j)).equals(String.valueOf(pre.charAt(j-1))))+"----------------"+pre.charAt(j)+"-----"+pre.charAt(j-1));
				if ((String.valueOf(pre.charAt(j)).equals(String.valueOf(pre.charAt(j-1))))) {
//					System.out.println("==========");
					count +=1;
				} else {
					resultStr += (count+"") + pre.charAt(j-1)+"";
//					System.out.println(count+"-------"+str);
					count = 1;
				}
			}
			resultStr += count+"" +String.valueOf(pre.charAt(j-1));
			pre = resultStr;
		}
		return resultStr;
    }
	//5 111221 		4 1211
	public static void main(String[] args) {
		
//		System.out.println(countAndSay(5));
//		System.out.println((1&0) == 0);
//		System.out.println(Instant.now().toEpochMilli());
//		int n = 200;
//		double x = 100f /200 ;
//		for (int i = 0; i < n; i++) {
//			System.out.println((i+1)*x);
//		}
//		System.out.println(100);
		
		int n = 3;
		double x = 100f / n;
		for (int i = 0; i < 3; i++) {
			int process = (int)((i+1)*x);
			System.out.println(process);
		}
	}
}
