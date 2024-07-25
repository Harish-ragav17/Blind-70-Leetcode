class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[100];
        Arrays.fill(dp,-1);
        return ways(0,s,dp);
    }
    public int ways(int i,String a,int[] dp){
           if(i >=a.length()){
            return 1;
           }
           if(dp[i]>-1){
            return dp[i];
           }
           int op1=a.charAt(i)-'0';
           int op2=0;
           if(i <= a.length()-2){
               op2=op1*10+a.charAt(i+1)-'0';
           } 
            int ans=0;
           if(op1>0) {
              ans+=ways(i+1,a,dp);
           }
           if(op1>0 && op2>0 && op2 <= 26 ){
            ans+=ways(i+2,a,dp);
           }
           return dp[i]=ans;
    }
}