class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int left=0;left<prices.length;left++) {
            if(prices[left]<min) {
                min = prices[left];
            }
            else {
                max = Math.max(max,prices[left]-min);
            }
        }

        return (max>0) ? max : 0;
    }
}