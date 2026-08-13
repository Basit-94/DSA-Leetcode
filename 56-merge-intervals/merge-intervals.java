class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]> result = new ArrayList<>();

        for(int interval[]:intervals)
        {
            int s = interval[0],e = interval[1];

            if(result.isEmpty() || s>result.get(result.size()-1)[1])
            {
                result.add(interval);
            }
            else
            {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],e);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}