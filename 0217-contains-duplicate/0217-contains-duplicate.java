class Solution {
    public boolean containsDuplicate(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++)
        {
            j=i+1;
            while(j>0)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else
                {
                  break;
                }
                j--;
            }
            if(j > 0)
            {
                if(nums[j]==nums[j-1])
                {
                 return true;
                }
            }
        }
        return false;
    }
}