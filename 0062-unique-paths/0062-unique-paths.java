class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return find(0,0,m,n);
    }
    public int find(int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }

        if(dp[i][j] > 0){
            return dp[i][j];
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        int left=find(i,j+1,m,n);
        int right=find(i+1,j,m,n);

        return dp[i][j] = left+right;
    }
}