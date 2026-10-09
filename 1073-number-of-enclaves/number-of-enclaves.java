class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        int dr[] = {0,-1,0,1};
        int dc[] = {-1,0,1,0};
        int vis[][] = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1 && vis[i][j]==0 && (i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1)) {
                    dfs(grid,vis,dr,dc,i,j);
                }
            }
        }

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(vis[i][j]==0 && grid[i][j]==1) {
                    count++;
                }
            }
        }

        return count;
    }
    void dfs(int grid[][],int vis[][],int dr[],int dc[],int i,int j) {
        vis[i][j] = 1;

        for(int k=0;k<4;k++) {
            int nr = i+dr[k];
            int nc = j+dc[k];
            if((nr>=0 && nc>=0 && nr<=grid.length-1 && nc<=grid[0].length-1) && grid[nr][nc]==1 && vis[nr][nc]==0) {
                dfs(grid,vis,dr,dc,nr,nc);
            }
        } 
    }
}