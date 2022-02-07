package io.github.wangrangzhi.testAndOkhttp.Solution;


import java.util.Arrays;

public class Solution004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] total = new int[length1 + length2];

        System.arraycopy(nums1, 0, total, 0, nums1.length);
        System.arraycopy(nums2, 0, total, nums1.length, nums2.length);

     //   System.out.println(total.toString());
        Arrays.sort(total);

        if (total.length % 2 == 1) {
            return total[total.length / 2];
        } else {
            double i = total[total.length / 2 - 1] + total[total.length / 2];

            return i / 2;
        }


    }


    public static void main(String[] args) {
        Solution004 solution = new Solution004();
        System.out.println(solution.findMedianSortedArrays(
                new int[]{1, 3},
                new int[]{2}
        ));
        System.out.println(solution.findMedianSortedArrays(
                new int[]{1, 2},
                new int[]{3, 4}
        ));
    }


}