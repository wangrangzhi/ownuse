package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0027 {

    public static void main(String[] args) {
        Solution0027 solution = new Solution0027();
        int[] data = new int[]{0, 3, 1, 1, 2, 3, 3, 3};
        int len = solution.removeElement(data, 3);
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + (i == len - 1 ? "" : ", "));
        }
    }

    public int removeElement(int[] nums, int val) {


        int tail = 0;

        for(int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                nums[tail] = nums[i];
                tail++;
            }
        }






        return tail;

    }
}

