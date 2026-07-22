class Solution {

    List<List<Integer>>result = new ArrayList<>();
    List<Integer>path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int start=0;       
        backtrack(candidates,target,start);

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
            path.add(candidates[i]);

            backtrack(candidates,target-candidates[i],i);

            path.remove(path.size()-1);
        }

    }
}