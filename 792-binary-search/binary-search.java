class Solution {
    public int search(int[] nums, int target) {
        int l=0,m=nums.length-1,k=l+(m-l)/2;
        while(l<=m)
        {
        if(target==nums[k])
        {
            return k;
        }
        else if(target<nums[k])
        {
            m = k-1;
        }
        else
        {
            l = k+1;
        }
        k = l+(m-l)/2;
        }
        return -1;
    }
}