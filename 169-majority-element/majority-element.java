class Solution {
    public int majorityElement(int[] nums) {

        int count=0,candidate=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                candidate = nums[i];
            }
            if(nums[i]==candidate)
            {
                count++;
            }

            if(nums[i]!=candidate)
            {
                count--;
            }
        }

        return candidate;

        /*HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;

        for(int i=0;i<nums.length;i++)
        {
            int f = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],f);
            if(max<f)
            {
                max = f;
            }
        }
        for(int key : map.keySet())
        {
            if(map.get(key)==max)
            {
                return key;
            }
        }

        return max;*/
    }
}