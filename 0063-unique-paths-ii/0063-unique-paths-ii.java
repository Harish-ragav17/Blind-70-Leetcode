class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
         dp=new int[m][n];
         return find(0,0,m,n,obstacleGrid);
    }
    public int find(int i,int j,int m,int n,int[][] obstacleGrid){
        if(i<0 || j<0 || i>=m || j>=n || obstacleGrid[i][j] == 1){
            return 0;
        }

        if(dp[i][j] > 0){
            return dp[i][j];
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        int left=find(i,j+1,m,n,obstacleGrid);
        int right=find(i+1,j,m,n,obstacleGrid);
         

        return dp[i][j] = left+right;

    }
}