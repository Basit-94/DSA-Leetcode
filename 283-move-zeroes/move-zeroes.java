class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        while(left<nums.length && nums[left]!=0) {
            left++;
        }
        int right = left+1;
        while(right<nums.length && nums[right]==0) {
            right++;
        }

        while(left<right && right<nums.length) {
            if(nums[left]==0 && nums[right]!=0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
            while(right<nums.length && nums[right]==0) {
                right++;
            }
        }
    }
}