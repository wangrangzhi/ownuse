package io.github.wangrangzhi.testAndOkhttp.Solution;


import java.util.Arrays;

public class Solution0053 {
    public static void main(String[] args) {
        Solution0053 solution = new Solution0053();
        // int[] nums0 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums1));
    }

    public int maxSubArray(int[] nums) {

        int len = nums.length, dp = nums[0], max = dp;
        for (int i = 1; i < len; ++i) {
            dp = nums[i] + (dp > 0 ? dp : 0);
            if (dp > max) max = dp;
        }
        return max;

    }
}

