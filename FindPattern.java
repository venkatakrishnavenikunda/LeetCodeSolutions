package ArraysPrograms;


//import java.util.ArrayDeque;
//import java.util.Deque;
//
//public class FindPattern {
//    public boolean find132pattern(int[] nums) {
//        Deque<Integer> stack = new ArrayDeque<>();
//        int ak = Integer.MIN_VALUE;
//        for (int i = nums.length - 1; i >= 0; --i) {
//            if (nums[i] < ak)
//                return true;
//
//            while (!stack.isEmpty() && stack.peek() < nums[i])
//                ak = stack.pop();
//
//            stack.push(nums[i]);
//        }
//        return false;
//    }
//
// 
//    public static void main(String[] args) {
//        FindPattern solution = new FindPattern();
//        int[] nums1 = {1, 2, 3, 4}; // Output: false
//        int[] nums2 = {3, 1, 4, 2}; // Output: true (132 pattern exists)
//        int[] nums3 = {-1, 3, 2, 0}; // Output: true
//        System.out.println(solution.find132pattern(nums1));
//        System.out.println(solution.find132pattern(nums2));
//        System.out.println( solution.find132pattern(nums3));
//    }
//}



//Without Deque

public class FindPattern {
  
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n]; 
        int top = -1; 
        int ak = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; --i) {
            if (nums[i] < ak)
                return true;
            while (top >= 0 && stack[top] < nums[i]) {
                ak = stack[top];
                top--; 
            }
            top++;
            stack[top] = nums[i];
        }
        return false;
    }
    public static void main(String[] args) {
        FindPattern solution = new FindPattern();
        int[] nums1 = {1, 2, 3, 4}; 
        int[] nums2 = {3, 1, 4, 2};
        int[] nums3 = {-1, 3, 2, 0}; 

        System.out.println(solution.find132pattern(nums1));
        System.out.println(solution.find132pattern(nums2));
        System.out.println(solution.find132pattern(nums3));
    }
}

