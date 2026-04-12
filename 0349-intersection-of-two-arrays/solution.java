class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i;
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        for(i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        i=0;
        int[] result = new int[set2.size()];
        for(int num : set2)
        {
            result[i++] = num;
        }
        return result;
    }
}
