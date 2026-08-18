class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<=(nums.length-k);i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<k;j++)
            {
                set.add(nums[i+j]);
            }

            for(int x : set)
            {
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        int result = -1;
        for(int y : map.keySet())
        {
            if(map.get(y)==1)
            {
                result = Math.max(result,y);
            }
        }

        return result;
    }
}