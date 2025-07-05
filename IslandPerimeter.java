package ArraysPrograms;


public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbors = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    ++islands;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1)
                        ++neighbors;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1)
                        ++neighbors;
                }
            }
        }
        return islands * 4 - neighbors * 2;
    }
    public static void main(String[] args) {
        IslandPerimeter solution = new IslandPerimeter();
        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        int perimeter = solution.islandPerimeter(grid);
        System.out.println(perimeter);
    }
}




//Leetcode Solution
//class Solution {
//	  public int islandPerimeter(int[][] grid) {
//	    int islands = 0;
//	    int neighbors = 0;
//	    for (int i = 0; i < grid.length; ++i)
//	      for (int j = 0; j < grid[0].length; ++j)
//	        if (grid[i][j] == 1) {
//	          ++islands;
//	          if (i - 1 >= 0 && grid[i - 1][j] == 1)
//	            ++neighbors;
//	          if (j - 1 >= 0 && grid[i][j - 1] == 1)
//	            ++neighbors;
//	        }
//
//	    return islands * 4 - neighbors * 2;
//	  }
//	}