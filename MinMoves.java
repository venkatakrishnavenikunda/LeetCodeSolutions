package ArraysPrograms;


public class MinMoves {
 public static void main(String[] args) {
     int[] nums = {1, 2, 3};
     Solution solution = new Solution();
     int result = solution.minMoves(nums);
     System.out.println(result);
 }
}
class Solution {
 public int minMoves(int[] nums) {
     int min = Integer.MAX_VALUE;
     int res = 0;
     for (int i = 0; i < nums.length; i++) {
         if (nums[i] < min) {
             min = nums[i];
         }
     }
     for (int i = 0; i < nums.length; i++) {
         res = res + (nums[i] - min);
     }
     return res;
 }
}

