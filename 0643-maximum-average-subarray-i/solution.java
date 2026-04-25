class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i;
        double max,s;
        max=s=0.0;
        for(i=0;i<k;i++)
        {
            s = s+nums[i];
        }
        max = s;
        for(i=k;i<nums.length;i++)
        {
            s = s+nums[i]-nums[i-k];
            max = Math.max(max, s);
        }
        return (max/k);
    }
}
