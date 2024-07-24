class Solution {
    public int rob(int[] nums) {
           int[] dp=new int[nums.length];
           Arrays.fill(dp,-1);
           return compute(dp.length-1,nums,dp);
    }
    public int compute(int n,int[] arr ,int[] dp){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }

        if(dp[n]!=-1){return dp[n];}

        int take = arr[n] + compute(n-2,arr,dp);
        int not_take = 0 + compute(n-1,arr,dp);

        return dp[n]=Math.max(take,not_take);
    }
}