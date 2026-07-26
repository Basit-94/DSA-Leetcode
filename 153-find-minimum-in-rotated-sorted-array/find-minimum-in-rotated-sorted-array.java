class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1,mid=0,min = nums[0];

        while(left<=right)
        {
            mid = left + (right-left)/2;
            if(nums[mid]<min)
            {
                min = nums[mid];
                
            }
            if(nums[mid]>nums[right])
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return min;     
    }
}