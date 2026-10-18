class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> revadj = new ArrayList<>();
        int indeg[] = new int[graph.length];

        for(int i=0;i<graph.length;i++) {
            revadj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++) {
            for(int it : graph[i]) {
                revadj.get(it).add(i);
                indeg[i]++;
            }
        }

        for(int i=0;i<graph.length;i++) {
            if(indeg[i]==0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            res.add(node);
            for(int it : revadj.get(node)) {
                indeg[it]--;
                if(indeg[it]==0) {
                    q.add(it);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}