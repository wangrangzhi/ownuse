package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution009 {

    public static void main(String[] args) {
        Solution009 solution = new Solution009();
       System.out.println(solution.isPalindrome(-1));
        System.out.println(solution.isPalindrome(10010));

        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(11));

        System.out.println(solution.isPalindrome(222222222));
        System.out.println(solution.isPalindrome(111));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x < 10) {
            return true;
        }

        String a = String.valueOf(x);


        for (int i = 0; i < a.length() / 2; i++) {

            String first = a.substring(i, i + 1);
            String last = a.substring(a.length() - i - 1, a.length() - i );


            if (Integer.parseInt(first) != Integer.parseInt(last)) {
                return false;
            }
        }
        return true;


    }
}

