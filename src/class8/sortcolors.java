class Solution {
    public void sortColors(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
        {
            int start = i;
            while(start>0)
            {
                if(nums[start]<nums[start-1])
                {
                    int temp = nums[start];
                    nums[start] = nums[start-1];
                    nums[start-1] = temp;
                    start--;
                }
                else
                    break;
            }
        }
    }
}
