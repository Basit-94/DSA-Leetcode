class Pair {
    int i,j,dis;
    Pair(int i,int j,int dis) {
        this.i = i;
        this.j = j;
        this.dis = dis;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int vis[][] = new int[mat.length][mat[0].length];
        int dist[][] = new int[mat.length][mat[0].length];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==0) {
                    vis[i][j] = 1;
                    
                    q.offer(new Pair(i,j,0));
                }
                else {
                    vis[i][j] = 0;
                }
            }
        }

        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};

        while(!q.isEmpty()) {
            int r = q.peek().i;
            int c = q.peek().j;
            int d = q.peek().dis;

            dist[r][c] = d;
            q.remove();

            for(int i=0;i<4;i++) {
                int nr = r+dr[i];
                int nc = c+dc[i];
                
                if(nr>=0 && nc>=0 && nr<mat.length && nc<mat[0].length && vis[nr][nc]==0) {
                    vis[nr][nc] = 1;
                    q.offer(new Pair(nr,nc,d+1));
                }
            }
        }

        return dist;
    }
}