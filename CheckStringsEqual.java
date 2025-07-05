package ArraysPrograms;
import java.util.ArrayDeque;
import java.util.Deque;

public class CheckStringsEqual {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ak = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] < ak)
                return true;
            while (!stack.isEmpty() && stack.peek() < nums[i])
                ak = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        CheckStringsEqual solution = new CheckStringsEqual();

    
        int[] nums1 = {1, 2, 3, 4};
//        int[] nums2 = {3, 1, 4, 2}; 
//        int[] nums3 = {-1, 3, 2, 0}; 

        System.out.println( solution.find132pattern(nums1));
//        System.out.println(solution.find132pattern(nums2)); 
//        System.out.println(solution.find132pattern(nums3));
    }
}





//Leetcode Solution 
//class Solution {
//	  public boolean find132pattern(int[] nums) {
//	    Deque<Integer> stack = new ArrayDeque<>();
//	    int ak = Integer.MIN_VALUE;        
//	    for (int i = nums.length - 1; i >= 0; --i) {
//	      if (nums[i] < ak)
//	        return true;
//	      while (!stack.isEmpty() && stack.peek() < nums[i])
//	        ak = stack.pop();
//	      stack.push(nums[i]); 
//	    }
//	    return false;
//	  }
//	}