class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            if(grid[i][0] == 1){
                dp[i][0] = 0; break;
            }else dp[i][0]=1;
        }
        for(int i=0; i<n; i++){
            if(grid[0][i] == 1){
                dp[0][i] = 0; break;
            }else dp[0][i]=1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if (grid[i][j] == 1) 
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}