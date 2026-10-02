class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,right=1,c=0;

        while(left<right && right<nums.length) {
            if(nums[left]!=nums[right]) {
                nums[++left] = nums[right];
                c++;
            }
            right++;
        }

        return c+1;
    }
}