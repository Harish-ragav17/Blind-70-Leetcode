class Solution {
    public int maxSubArray(int[] nums) {
         int max_sum=nums[0];
         int current=0;

         for(int i : nums)
         {
             current+=i;
             
             if(current>max_sum)
             {
                 max_sum=current;
             }

             if(current<0)
             {
                 current=0;
             }
         }
         return max_sum;
    }
}