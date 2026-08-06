class Solution {
    public int jump(int[] nums) {
        int far = 0,count = 0,end = 0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            far = Math.max(far,i+nums[i]);

            if(end==i)
            {
                count++;
                end = far;
            }
        }
        return count;
    }
}