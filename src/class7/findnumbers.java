class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n:nums)
            if((n>9 && n<100)||(n>999&&n<10000)||n==100000) //input ranges form 0<input<10^5
                count++;
        return count;
    }
}