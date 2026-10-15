class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        return dfs(adj,numCourses);
    }
    private int[] dfs(List<List<Integer>> adj,int numCourses) {
        int indeg[] = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            for(int it : adj.get(i)) {
                indeg[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indeg[i]==0) {
                q.offer(i);
            }
        }
        int ans[] = new int[numCourses];
        int k=0;

        while(!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            ans[k++] = node;

            for(int it : adj.get(node)) {
                indeg[it]--;
                if(indeg[it]==0) {
                    q.offer(it);
                }
            }
        }
        if(k<numCourses) {
            return new int[]{};
        }

        return ans;
    }
}