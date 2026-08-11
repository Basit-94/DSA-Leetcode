class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1)
        {
            return (nums[0]+1);
        }

        int result=0;
  
        for(int i=1;i<nums.length;i++)
        {
            int s = sum(nums,nums[i-1]);

            result = Math.max(result,s);
            break;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(result==nums[i])
            {
                result++;
            }
        }

        return result;
    }
    int sum(int nums[],int start)
    {
        int i=1;
        while(i<nums.length && nums[i]==(nums[i-1]+1))
        {
            start = start+nums[i++];
        }
        return start;
    }
}