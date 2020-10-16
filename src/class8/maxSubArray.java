class Solution {
  public int maxSubArray(int[] nums) {
    int currMax = nums[0];
    int gMax = nums[0];
    
    for(int i = 1; i < nums.length; i++) {
      currMax = Math.max(nums[i], nums[i] + currMax);
      gMax = Math.max(gMax, currMax);
    }
    
    return gMax;
  }
}