class Solution {
    public int missingInteger(int[] nums) {
        int result=0,i=1;

        if(nums.length==1)
        {
            return (nums[0]+1);
        }

        int s = sum(nums,nums[i-1]);
        result = Math.max(result,s);

        boolean map[] = new boolean[51];
        for(i=0;i<nums.length;i++)
        {
            map[nums[i]] = true;
        }

        if(result<=50)
        {
            while(result<=50 && map[result]==true)
            {
                result++;
            }
        }

        return result;

        /*HashSet<Integer> set = new HashSet<>();

        for(i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        return value(result,set);*/
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
    /*int value(int result,HashSet set)
    {
        while(set.contains(result))
        {
            result++;
        }
        return result;
    }*/
}