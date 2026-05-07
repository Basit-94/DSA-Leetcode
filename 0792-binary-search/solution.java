class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int m = nums.length-1;
        while(l<=m)
        {
            int mid = l + (m-l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                m = mid-1;
            }
        }
        return -1;
    }
}
