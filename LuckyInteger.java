package ArraysPrograms;

import java.util.Arrays;

public class LuckyInteger {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int lucky = -1;
        for (int i = 0; i < n;) {
            int curr = arr[i];
            int count = 0;
            while (i < n && arr[i] == curr) {
                count++;
                i++;
            }
            if (count == curr) {
                lucky = Math.max(lucky, curr);
            }
        }

        return lucky;
    }
    public static void main(String[] args) {
        LuckyInteger solution = new LuckyInteger();
        int[] arr1 = {2, 2, 3, 4};
//        int[] arr2 = {1, 2, 2, 3, 3, 3};
//        int[] arr3 = {2, 2, 2, 3, 3};

        System.out.println(solution.findLucky(arr1));
//        System.out.println(solution.findLucky(arr2)); 
//        System.out.println(solution.findLucky(arr3)); 
    }
}











///LeetCode Solution
//class Solution {
//    public int findLucky(int[] arr) {
//     int n=arr.length;
//     Arrays.sort(arr);
//     int lucky=-1;
//     for(int i=0;i<n;)
//     {
//        int curr=arr[i];
//        int count=0;
//        while(i<n && arr[i]==curr)
//        {
//            count++;
//            i++;
//        }
//        if(count==curr)
//        {
//            lucky=Math.max(lucky,curr);
//        }
//     }
//     return lucky;   
//    }
//}