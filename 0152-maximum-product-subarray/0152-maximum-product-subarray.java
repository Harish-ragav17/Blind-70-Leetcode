class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
         double max_prod=Integer.MIN_VALUE;
         double left=1,right=1;

         for(int i=0;i<nums.length;i++)
         {
            if(left ==0){
                left=1;
            }
            if(right==0){
                right=1;
            }

            left*=nums[i];
            right*=nums[nums.length-1-i];

            if(left > max_prod){
                max_prod=left;
            }
            if(right > max_prod){
                 max_prod=right;
            }
         }
         return (int)max_prod;
    }
}