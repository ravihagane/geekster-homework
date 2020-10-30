class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int l = 0;
        int r = prices.length - 1;
        int leftMin = prices[l];
        int rightMax = prices[r];
        int max = 0;
        while (l <= r) {
            max = Math.max(max, prices[l] - leftMin); // in case of case 3)
            max = Math.max(max, rightMax - prices[r]); // in case of case 2)
            leftMin = Math.min(leftMin, prices[l++]);
            rightMax = Math.max(rightMax, prices[r--]);
            max = Math.max(max, rightMax - leftMin); // case 1)
        }
        return max;
    }
}