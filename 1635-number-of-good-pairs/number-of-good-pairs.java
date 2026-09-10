class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums.length-1;i>=0;i--)
        {
            if(map.getOrDefault(nums[i],0)!=0)
            {
                count += map.get(nums[i]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        

        /*for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }*/

        return count;
    }
}