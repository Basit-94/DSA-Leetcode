class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        Arrays.sort(nums);
        int close=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int l=i+1,r=nums.length-1;

            while(l<r)
            {
                sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(close-target))
                {
                    close = sum;
                }
                if(sum==target)
                {
                    return sum;
                }
                else if(sum<target)
                {
                    l++;
                }
                else 
                {
                    r--;
                }
            }
        }
        return close;
    }
}
