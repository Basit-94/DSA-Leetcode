class Solution {
    public int singleNumber(int[] nums) {
        int i=0,c=0,result=0,j=0;
        for(i=0;i<32;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(((nums[j]>>i)&1)==1)
                {
                    c++;
                }
            }
            if(c%3==1)
            {
                result = result | (1<<i);
            }
            c=0;
        }

        return result;
    }
}