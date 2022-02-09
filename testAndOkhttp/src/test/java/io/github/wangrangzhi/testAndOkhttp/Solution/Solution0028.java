package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0028 {
    public static void main(String[] args) {
        Solution0028 solution = new Solution0028();
        System.out.println(solution.strStr("12345", "23"));
        System.out.println(solution.strStr("12345", ""));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() < 1) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if(i+needle.length() > haystack.length()){
                return -1;
            }



        }


        return 0;

    }
}

