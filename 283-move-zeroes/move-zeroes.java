class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=1;

        while(left<right && right<nums.length) {
            if(nums[left]==0 && nums[right]!=0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            } 
            
            while(left<nums.length && nums[left]!=0) {
                left++;
            }
            right = left+1;
            while(right<nums.length && nums[right]==0) {
                right++;
            }
        }
    }
}