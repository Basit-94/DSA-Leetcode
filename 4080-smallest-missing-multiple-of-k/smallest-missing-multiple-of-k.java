class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int k1=k;
        for(int num:nums)
        {
            set.add(num);
        }
        while(set.contains(k1))
        {
            k1 = k1+k;
        }

        return k1;
    }
}