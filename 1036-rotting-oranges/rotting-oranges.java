class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int count=0,cnt=0,tm=0;
        int vis[][] = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else
                {
                    vis[i][j] = 0;
                }

                if(grid[i][j]==1)
                {
                    count++;
                    
                }
            }
        }

        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};

        while(!q.isEmpty())
        {
            int r = q.peek().r;
            int c = q.peek().c;
            int t = q.peek().tm;

            tm = Math.max(tm,t);
            q.remove();

            for(int i=0;i<=3;i++)
            {
                int nr = r+dr[i];
                int nc = c+dc[i];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length &&  grid[nr][nc]==1 && vis[nr][nc]==0)
                {
                    q.add(new Pair(nr,nc,t+1));
                    vis[nr][nc] = 2;
                    cnt++;
                }
            }
        }

        return (cnt==count) ? tm : -1;
    }
}
class Pair {
    int r, c,tm;

    Pair(int r, int c,int tm) {
        this.r = r;
        this.c = c;
        this.tm = tm;
    }
}