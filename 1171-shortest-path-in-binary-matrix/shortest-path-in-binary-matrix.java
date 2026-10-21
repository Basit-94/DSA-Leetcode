class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        if(grid[0][0]==1 || grid[grid.length-1][grid.length-1]==1) {
            return -1;
        }
        int r[] = {-1,-1,-1,0,0,1,1,1};
        int c[] = {-1,0,1,-1,1,-1,0,1};
        int vis[][] = new int[grid.length][grid.length];
        q.add(new int[]{0,0,1});
        vis[0][0] = 1;
        
        while(!q.isEmpty()) {
            int arr[] = q.peek();
            q.remove();
            int i = arr[0];
            int j = arr[1];
            int len = arr[2];

            if(i==grid.length-1 && j==grid.length-1) {
                return len;
            }

            for(int k=0;k<8;k++) {
                int nr = r[k]+i;
                int nc = c[k]+j;
                if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]==1 || vis[nr][nc]==1) {
                    continue;
                }
                vis[nr][nc] = 1;
                q.add(new int[]{nr,nc,len+1});
            }
        }

        return -1;
    }
}