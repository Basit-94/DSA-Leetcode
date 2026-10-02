class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,mid = left + (right-left)/2;

        while(left<right) {
            if(target==nums[mid]) {
                return mid;
            }
            else if(nums[mid]<target) {
                left++;
            }
            else {
                right--;
            }
            mid = left + (right-left)/2;
        }

        return (nums[mid]<target) ? mid+1 : mid;
    }
}