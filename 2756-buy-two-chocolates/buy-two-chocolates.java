class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=101,min2=101;

        for(int i=0;i<prices.length;i++)
        {
            if(min1>prices[i])
            {
                min2 = min1;
                min1 = prices[i];
            }
            else if(min2>prices[i])
            {
                min2 = prices[i];
            }
        }

        if(money-(min1+min2)>=0)
        {
            return money-(min1+min2);
        }
        return money;
    }
}