class Solution {
    public int compareBitonicSums(int[] nums) {
        long curr=0,prev=0,s1=0,s2=0;
        int i=0;
        
        curr = nums[0];
        while(curr>prev && i<nums.length-1)
        { 
            s1 = s1+curr;
            i++;
            prev = curr;
            curr = nums[i];
            
        }
        while(i<nums.length-1)
        {
            s2 = s2+prev;
            i++;
            prev = curr;
            curr = nums[i];
            
        }
        s2 = s2+prev+curr;

        if(s1>s2)
        {
            return 0;
        }
        else if(s2>s1)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}