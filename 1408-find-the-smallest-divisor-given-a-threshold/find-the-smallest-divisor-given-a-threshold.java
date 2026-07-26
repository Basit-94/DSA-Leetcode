class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
        }

        return binarysearch(nums,threshold,1,max);
    }
    int binarysearch(int nums[],int threshold,int left,int right)
    {
        int ans = right;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            int div = cal(nums,mid);

            if(div<=threshold)
            {
                ans = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return ans;
    }
    int cal(int nums[],int d)
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + (nums[i]+d-1)/d;
        }
        return sum;
    }
}