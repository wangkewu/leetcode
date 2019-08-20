package common.web.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode784 {
	
	public static List<String> letterCasePermutation2(String S) {

	       List<String> res = new LinkedList<>();
	       dfs2("", S, res, 0);
	       return res;
	   }

	   public static void dfs2(String pre, String S, List<String> res, int index) {

	       if (index == S.length()) {
	    	   System.out.println("=---=--="+pre);
	    	   res.add(pre);
	    	   
	       }
	       else {
	           char ch = S.charAt(index);
	           if (!Character.isLetter(ch))
	               dfs2(pre + ch, S, res, index + 1);
	           else {

	               ch = Character.toLowerCase(ch);
	               System.out.println("=========="+(pre+ch));
	               dfs2(pre + ch, S, res, index + 1);

	               System.out.println("=====================-------------"+(pre+ch));
	               ch = Character.toUpperCase(ch);
	               dfs2(pre + ch, S, res, index + 1);
	           }
	       }
	   }
	
	 public static List<String> letterCasePermutation(String S) {
		 List<String> res = new ArrayList<String>();
		 dfs("", S, res, 0);
		 return res;
	 }

	private static void dfs(String pre, String S, List<String> res, int index) {
		
		if (index == S.length()) {
			res.add(pre);
		} else {
			char ch = S.charAt(index);
			if (!Character.isLetter(ch)) {
				dfs(pre+ch, S, res, ++index);
			} else {
			   ch = Character.toLowerCase(ch);
               dfs(pre + ch, S, res, index + 1);
               ch = Character.toUpperCase(ch);
               dfs(pre + ch, S, res, index + 1);
			}
		}
		
	}
	 
	public static void main(String[] args) {
//		int count = 0;
//		System.out.println(count++);
//		System.out.println(count);
//		List<String> s = letterCasePermutation2("a1b2");
//		List<String> s = letterCasePermutation2("a1b2");
//		for(int i = 0;i  < s.size(); i++) {
//			System.out.println(s.get(i));
//		}
		
		System.out.println((2&3)==1);
	}
	 
}
