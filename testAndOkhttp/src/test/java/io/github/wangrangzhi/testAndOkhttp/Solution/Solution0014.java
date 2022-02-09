package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0014 {

    public static void main(String[] args) {
        Solution0014 solution = new Solution0014();
        System.out.println(solution.longestCommonPrefix(new String[]{"abca","aba","aaab"}));
    }

    public String longestCommonPrefix(String[] strs) {



        if(strs.length<1){
            return "";
        }

        if(strs.length ==1 && strs[0].length()>0){
            return strs[0];
        }


        int shortLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (shortLength > strs[i].length()) {
                shortLength = strs[i].length();
            }
        }
        if(shortLength == 0){
            return "";
        }

        for (int j = 0; j < strs.length; j++) {
            if (strs[0].charAt(0) != strs[j].charAt(0))
                return "";
        }


        for (int i = 0; i < shortLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i))
                    return strs[0].substring(0, i);
            }
        }


        return strs[0].substring(0, shortLength);

    }
}

