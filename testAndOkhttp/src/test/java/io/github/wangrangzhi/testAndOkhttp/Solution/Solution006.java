package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution006 {

    public static void main(String[] args) {
        Solution006 solution = new Solution006();
        System.out.println(solution.convert("PAYPALISHIRING", 3));// PAHNAPLSIIGYIR
        System.out.println(solution.convert("ABCD", 4));
    }

    public String convert(String s, int numRows) {

        int coltotal = numRows * 3 - 2;

        int totalcol = (s.length() / coltotal) + 1;

        String[][] result = new String[numRows][];

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        for(int i = 0;i<totalcol;i++){

        }

        return null;

    }


}