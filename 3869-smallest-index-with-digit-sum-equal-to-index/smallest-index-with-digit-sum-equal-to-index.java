class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            while(temp>0)
            {
                sum = sum+temp%10;
                temp = temp/10;
            }
            if(sum==i)
            {
                return i;
            }
            sum=0;
        }

        return -1;
    }
}