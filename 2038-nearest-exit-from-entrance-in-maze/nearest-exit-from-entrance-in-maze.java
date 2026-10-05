class Pair {
    int row,col,steps;
    Pair(int row,int col,int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int vis[][] = new int[maze.length][maze[0].length];
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(entrance[0],entrance[1],0));
        vis[entrance[0]][entrance[1]] = 1;

        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};

        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int s = q.peek().steps;

            q.remove();
            for(int i=0;i<4;i++) {
                int nr = r+dr[i];
                int nc = c+dc[i];
                if(nr>=0 && nc>=0 && nr<maze.length && nc<maze[0].length && vis[nr][nc]==0) {
                    if(maze[nr][nc]=='+') {
                        continue;
                    }
                    if(maze[nr][nc]=='.' && (nr==0 || nc==0 || nr==maze.length-1 || nc==maze[0].length-1)) {
                        return s+1;
                    }
                    else {
                        q.offer(new Pair(nr,nc,s+1));
                        vis[nr][nc] = 1;
                    }
                }
            }
        }

        return -1;
    }
}