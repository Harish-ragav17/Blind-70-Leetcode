class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
        int max=nums[0];

        for(int i=1;i<nums.length && max >= i ;i++){
             if(max < i + nums[i]){
                max=i+nums[i];
             }

             if(max >= nums.length-1){
                return true;
             }
        }
        return false;
    }
}