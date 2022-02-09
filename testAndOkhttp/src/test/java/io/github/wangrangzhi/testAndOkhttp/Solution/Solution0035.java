package io.github.wangrangzhi.testAndOkhttp.Solution;


public class Solution0035 {
    public static void main(String[] args) {
        Solution0035 solution = new Solution0035();
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums, 5));
        System.out.println(solution.searchInsert(nums, 2));
        System.out.println(solution.searchInsert(nums, 7));
        System.out.println(solution.searchInsert(nums, 0));
    }

    public int searchInsert(int[] nums, int target) {

        for(int i = 0; i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i] > target){
                return i;
            }
        }





       return nums.length;

    }
}

