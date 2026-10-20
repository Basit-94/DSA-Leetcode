class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int vis[] = new int[rooms.size()];
        Queue<List<Integer>> q = new LinkedList<>();

        q.add(rooms.get(0));
        vis[0] = 1;

        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()) {
            list = q.peek();
            q.remove();
            for(int room : list) {
                if(vis[room]==0) {
                    q.add(rooms.get(room));
                    vis[room] = 1;
                }
            }
        }

        for(int i=0;i<vis.length;i++) {
            if(vis[i]==0) {
                return false;
            }
        }

        return true;
    }
}