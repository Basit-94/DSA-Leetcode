class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int t=0,l=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]<target) {
                l++;
            }
            if(nums[i]==target) {
                t++;
            }
        }

        for(int i=0;i<t;i++) {
            list.add(i+l);
        }

        /*Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                list.add(i);
            }
        }*/

        return list;
    }
}