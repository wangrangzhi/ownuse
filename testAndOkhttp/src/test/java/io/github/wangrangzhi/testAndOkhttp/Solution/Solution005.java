package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution005 {


    public static void main(String[] args) {
        Solution005 solution = new Solution005();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }

    public String longestPalindrome(String s) {

        char[] a = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if (i == 0) {
                continue;
            }

            if (i == s.length() - 1) {
                continue;
            }


        }

        return null;
    }


}