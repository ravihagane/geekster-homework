class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rs = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int k=0;k<nums.length;k++){
                if(i==k){
                    continue;
                }
                if(nums[k]< nums[i]){
                    count++;
                }
            }
            
            rs[i] =count;
        }
        
        return rs;
    }
}