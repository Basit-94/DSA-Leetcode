class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0],count = 0;
        for(int i=0;i<nums.length;i++) {
            if(candidate==nums[i]) {
                count++;
            }
            else if(candidate!=nums[i] && count>0) {
                count--;
            }
            else {
                candidate = nums[i];
            }
        }

        return candidate;
    }
}