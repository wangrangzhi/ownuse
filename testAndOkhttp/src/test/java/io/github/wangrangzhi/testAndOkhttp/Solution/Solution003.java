package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution003 {
    public static void main(String[] args) {
        Solution003 solution = new Solution003();
//        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int result = 1;
        String a = "";
        String b = "";

        for (int i = 0; i < s.length(); i++) {


            if (i == 0) {
                result = b.length();
            }

            a = s.substring(i, i + 1);


            if (b == null) {
                b += a;
            } else {
                if (b.contains(a)) {
                    int indexOf = b.indexOf(a);
                    b = b.substring(indexOf + 1);
                    b += a;
                } else {
                    b += a;
                }
            }

            if (result < b.length()) {
                result += 1;
            }


        }


        return result;

    }


}