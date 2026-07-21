class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack(0,nums);

        return result;
    }
    private void backtrack(int start,int nums[])
    {
        result.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++)
        {
            path.add(nums[i]);

            backtrack(i+1,nums);

            path.remove(path.size()-1);
        }
    }
}
