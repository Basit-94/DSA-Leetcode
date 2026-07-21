class Solution {

    List<Integer> path = new ArrayList<>();
    List<List<Integer>>result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        backtrack(visited,nums);

        return result;
    }
    private void backtrack(boolean visited[],int nums[])
    {
        if(path.size()==nums.length)
        {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
            {
                continue;
            }

            if(i>0 && nums[i]==nums[i-1] && !visited[i-1])
            {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            
            backtrack(visited,nums);

            path.remove(path.size()-1);
            visited[i] = false;
        }      
    }
}