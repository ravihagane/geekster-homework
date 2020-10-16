class Solution {
    public int maxProduct(int[] nums) 
    {
        int meh=1,msf=0,max=Integer.MIN_VALUE;
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            meh=meh*nums[i];
            if(meh>msf)
                msf=meh;
            else if(meh==0)
                meh=1;
        }
        meh=1;
        for(int j=nums.length-1;j>=0;j--)
        {
            meh=meh*nums[j];
            if(meh>msf)
                msf=meh;
            else if(meh==0)
                meh=1;
        }
        return msf;
    }
}