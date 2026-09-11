class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0,min=Integer.MAX_VALUE,sum=0,flag=-1;

        while(left<=right && right<nums.length)
        {
            sum = sum+nums[right];
            while(sum>=target && left<nums.length)
            {
                min = Math.min(min,right-left+1);
                sum = sum-nums[left];
                left++;
                flag=1;
            }
            right++;
        }

        if(flag==1)
        {
            return min;
        }
        return 0;
    }
}