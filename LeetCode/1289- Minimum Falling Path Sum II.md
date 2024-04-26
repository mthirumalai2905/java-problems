## 1289 - Minimum Falling Path Sum II

 Given an ```n x n``` integer matrix grid, return the minimum sum of a falling path 
 with non-zero shifts. A falling path with non-zero shifts is a choice of exactly one element
 from each row of grid such that no two elements chosen in adjacent rows are in the same column

```java
class Solution {
    int[][] t = new int[201][201];
    
    public int solve(int col, int row, int[][] grid){
        int n = grid.length;
        if(row == n - 1){
            return grid[row][col];
        }
        if(t[row][col] != 0){
            return t[row][col];
        }
        int ans = Integer.MAX_VALUE;
        for(int nextCol = 0; nextCol < n; nextCol++){
            if(nextCol != col){
                ans = Math.min(ans, solve(nextCol, row + 1, grid));
            }
        }
        return t[row][col] = ans + grid[row][col];
    }
    
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length; 
        int result = Integer.MAX_VALUE;
        for(int col = 0; col < n; col++){
            result = Math.min(result, solve(col,0,grid));
        }
        return result;
    }
}
```
