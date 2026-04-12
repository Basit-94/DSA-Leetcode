class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,c;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
            c = target-nums[i];
            if(map.containsKey(c))
            {
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
