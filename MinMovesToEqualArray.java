package ArraysPrograms;


import java.util.Arrays;

public class MinMovesToEqualArray {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int median = (n % 2 == 0) ? (nums[n / 2] + nums[n / 2 - 1]) / 2 : nums[n / 2];
        int steps = 0;
        for (int num : nums) {
            steps += Math.abs(num - median);
        }
        return steps;
    }
    public static void main(String[] args) {
    	MinMovesToEqualArray sol = new MinMovesToEqualArray();

        int[] nums = {1, 2, 3};
        int result = sol.minMoves2(nums);

        System.out.println(result);
    }
}



//LeetCode Platform Way
//class Solution {
//    public int minMoves2(int[] nums) {
//        int n=nums.length;
//        Arrays.sort(nums);
//        int median=nums.length%2==0 ? (nums[n/2]+nums[n/2-1])/2 :nums[n/2];
//        int steps=0;
//        for(int num:nums){
//            steps+=Math.abs(num-median);
//        }
//        return steps;
//    }
//}