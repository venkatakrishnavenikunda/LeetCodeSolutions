package ArraysPrograms;

import java.util.Arrays;

public class MatchstickstoSquare {

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        int[] matchsticks = {1, 1, 2, 2, 2};
        boolean result = sol.makesquare(matchsticks);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
class Solution2 {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) return false;
        int sum = 0;
        for (int len : matchsticks) {
            sum += len;
        }
        if (sum % 4 != 0) return false;
        int max = sum / 4;
        Arrays.sort(matchsticks);
        int[] sides = new int[] {max, max, max, max};
        if (matchsticks[matchsticks.length - 1] > max) return false;
        return dfs(matchsticks.length - 1, matchsticks, sides);
    }
    public boolean dfs(int idx, int[] matchsticks, int[] sides) {
        if (idx < 0) {
            return (sides[0] == 0 && sides[1] == 0 && sides[2] == 0 && sides[3] == 0);
        }
        for (int j = 0; j < 4; j++) {
            if (matchsticks[idx] > sides[j]) continue;
            sides[j] -= matchsticks[idx];
            if (dfs(idx - 1, matchsticks, sides)) return true;
            sides[j] += matchsticks[idx];
        }
        return false;
    }
}
