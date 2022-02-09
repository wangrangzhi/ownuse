package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0058 {
    public static void main(String[] args) {
        Solution0058 solution = new Solution0058();
        System.out.println(solution.lengthOfLastWord("word "));
        System.out.println(solution.lengthOfLastWord("hello world"));
    }

    public int lengthOfLastWord(String s) {

        return s.trim().length() - s.trim().lastIndexOf(" ") -1;


    }
}

