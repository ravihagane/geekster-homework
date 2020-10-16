class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] returnList = new int[2*n];
        for (int x = 0; x < 2*n; x += 2) {
            returnList[x] = (nums[x-(x/2)]);
            returnList[x+1] = (nums[x-(x/2)+n]);
        }
        return returnList;
    }
}