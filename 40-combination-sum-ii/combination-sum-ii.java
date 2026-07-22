class Solution {

    List<List<Integer>>result = new ArrayList<>();
    List<Integer>path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);    
        backtrack(candidates,target,0);

        return result;

    }
    private void backtrack(int[] candidates, int target,int start)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(path));
            return;
        }

        if(target<0)
        {
            return;           
        }

        for(int i=start;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1])
            {
                continue;
            }

            path.add(candidates[i]);

            backtrack(candidates,target-candidates[i],i+1);

            path.remove(path.size()-1);
        }

    }
}