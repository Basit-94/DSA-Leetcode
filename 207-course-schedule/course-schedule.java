class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int vis[] = new int[numCourses];
        int path[] = new int[numCourses];

        for(int i=0;i<numCourses;i++) {
            if(vis[i]==0) {
                if(dfs(i,adj,vis,path)==true) {
                    return false;
                }
            }
        }

        return true;
    }
    boolean dfs(int node, List<List<Integer>> adj,int[] vis, int[] path) {
        vis[node] = 1;
        path[node] = 1;

        for(int i : adj.get(node)) {
            if(vis[i]==0) {
                if(dfs(i,adj,vis,path)==true) {
                    return true;
                }
            }
            else {
                if(path[i]==1) {
                    return true;
                }
            }
        }

        path[node] = 0;
        return false;
    }
}