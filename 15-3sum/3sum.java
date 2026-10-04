class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                break;
            }
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int target = -1*nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right) {
                if(nums[left]+nums[right]==target) {
                    list.add(Arrays.asList(nums[left],nums[right],nums[i]));
                    left++;
                    right--;

                    while(left<nums.length && nums[left]==nums[left-1]) {
                        left++;
                    }
                    while(right>0 && nums[right]==nums[right+1]) {
                        right--;
                    }
                }
                else if(nums[left]+nums[right]<target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return list;
    }
}