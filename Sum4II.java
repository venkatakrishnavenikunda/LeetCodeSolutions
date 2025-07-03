package ArraysPrograms;

import java.util.HashMap;
import java.util.Map;

public class Sum4II {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum_AB = A[i] + B[j];
                map.put(sum_AB, map.getOrDefault(sum_AB, 0) + 1);
            }
        }
        int ans = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum_CD = C[i] + D[j];
                int sum_AB = -sum_CD;
                ans += map.getOrDefault(sum_AB, 0);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Sum4II sol = new Sum4II();
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        int result = sol.fourSumCount(A, B, C, D);
        System.out.println(result);
    }
}


//Another way 

//class Solution {
//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<A.length;i++){
//            for(int j=0;j<B.length;j++){
//                int sum_AB=A[i]+B[j];
//                map.put(sum_AB, map.getOrDefault(sum_AB,0)+1);
//            }
//        }
//        int ans=0;
//        for(int i=0; i<C.length;i++){
//            for(int j=0;j<D.length;j++){
//                int sum_CD=C[i]+D[j];
//                int sum_AB=-sum_CD;
//                ans+=map.getOrDefault(sum_AB,0);
//            }
//        }
//        return ans;
//    }
//}