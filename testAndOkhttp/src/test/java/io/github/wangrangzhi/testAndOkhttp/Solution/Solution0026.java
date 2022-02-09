package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0026 {

    public static void main(String[] args) {
        Solution0026 solution = new Solution0026();
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 3};
        int len = solution.removeDuplicates(data);
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + (i == len - 1 ? "" : ", "));
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int tail = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            }

            if (nums[i] != nums[i - 1]) {
                nums[tail] = nums[i];
                tail++;

            }else{

            }

        }

        return tail;
//        int len = nums.length;
//        if (len <= 1) return len;
//        int tail = 1;
//        for (int i = 1; i < len; ++i) {
//            if (nums[i - 1] != nums[i]) {
//                nums[tail++] = nums[i];
//            }
//        }
//        return tail;
    }
}

