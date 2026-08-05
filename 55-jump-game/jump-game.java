class Solution {
    public boolean canJump(int[] nums) {
        int far = 0;
        int target = nums.length-1;

        for(int i=0;i<nums.length;i++)
        {
            if(far<i)
            {
                return false;
            }

            far = Math.max(far,i+nums[i]);

            if(far>=target)
            {
                return true;
            }
        }

        return true;

    }
}