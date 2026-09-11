class Solution {
    public int removeElement(int[] nums, int val) {
        int r=nums.length-1,count=0,l=0;
        while(l<=r && r<nums.length)
        {
            while(r>=l && nums[r]==val)
            {
                r--;
            }
            if(r>=l && nums[l]==val)
            {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
            }
            l++;
        }

        return r+1;
    }
}