class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int maxSubarrayLength(int[] nums, int k) {

        return finalist(nums,k,0,0);
    }
   
    int finalist(int nums[],int k,int a,int b)
    {
        int c=0,result=0;
        
        while(b<nums.length)
        {
            map.put(nums[b], map.getOrDefault(nums[b], 0) + 1);

            while(a<nums.length && map.get(nums[b])>k)
            {
                map.put(nums[a],map.get(nums[a])-1);
                a++;
            }
            b++;

            c = b-a;
            result = Math.max(result,c);
        }

        return result;
    }
}