package common.web.algorithm;

import java.util.Arrays;

import org.apache.log4j.chainsaw.Main;

/**
 * 最长公共前缀
 * @author kewu.wang
 *
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        //只用排序之后的，第一个与最后一个字符串比较
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = "";
        Arrays.sort(strs);
        int size = strs.length;
        int n = strs[0].length();
        int m = strs[size - 1].length();

        for (int i = 0; i < n; i++) {
            if (m > i && strs[0].charAt(i) == strs[size - 1].charAt(i)) {
                result += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return result;
    }//longestCommonPrefix

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abcdaaaaaa", "abcdes", "abcde"}));
    }
}
