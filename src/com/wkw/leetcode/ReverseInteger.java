package common.web.algorithm;

public class ReverseInteger {

	
	public static void main(String[] args) {
		
		int x = reverse(1000000002);
		System.out.println(x);
		
	}
	public static int reverse(int x) {
		
		int result = 0;
		while(x != 0) {
			if(result > Integer.MAX_VALUE / 10) {
				System.out.println("溢出");
				return 0;
			}
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return result;
	}
}
