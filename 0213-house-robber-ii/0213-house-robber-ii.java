class Solution {
    public int rob(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }

           int[] dp=new int[nums.length-1];
           Arrays.fill(dp,-1);
           int[] dp2=new int[nums.length-1];
           Arrays.fill(dp2,-1);

           int[] tmp1=new int[nums.length-1];
           int[] tmp2=new int[nums.length-1];
           tmp1=Arrays.copyOfRange(nums,1,nums.length);
           tmp2=Arrays.copyOfRange(nums,0,nums.length-1);

           return Math.max(compute(tmp1.length-1,tmp1,dp),
                           compute(tmp2.length-1,tmp2,dp2));
    }
    public int compute(int n,int[] arr ,int[] dp){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }

        if(dp[n]!=-1){return dp[n];
        }

        int take = arr[n] + compute(n-2,arr,dp);
        int not_take = 0 + compute(n-1,arr,dp);

        return dp[n]=Math.max(take,not_take);
    }
}