class Solution {
    public int longestOnes(int[] nums, int k) {
        return consecutive(nums,k,0,0);
    }
    int consecutive(int nums[],int k,int left,int right)
    {
        int t=k,c=0,res=0,result=0;
        while(right<nums.length)
        {
            if(nums[right]==1)
            {
                right++;
            }
            else if(nums[right]==0 && t>0)
            {
                t--;
                right++;
            }
            else
            {
            while(t<=0 && right<nums.length)
            {
                if(nums[left]==0)
                {
                    t++;  
                }
                left++;
            }
            }

            res = right-left;
            result = Math.max(result,res);
        }

        return result;
    }
}