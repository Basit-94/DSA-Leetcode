class Solution {
    public void solve(char[][] board) {
        int vis[][] = new int[board.length][board[0].length];
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        for(int i=0;i<board[0].length;i++) {
            if(board[0][i]=='O') {
                dfs(board,vis,0,i,dr,dc);
            }
            if(board[board.length-1][i]=='O') {
                dfs(board,vis,board.length-1,i,dr,dc);
            }
        }

        for(int i=0;i<board.length;i++) {
            if(board[i][0]=='O') {
                dfs(board,vis,i,0,dr,dc);
            }
            if(board[i][board[0].length-1]=='O') {
                dfs(board,vis,i,board[0].length-1,dr,dc);
            }
        }

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(vis[i][j]==0 && board[i][j]=='O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
    private void dfs(char[][] board,int vis[][],int i,int j,int dr[],int dc[]) {
        vis[i][j] = 1;

        for(int k=0;k<4;k++) {
            int nr = i+dr[k];
            int nc = j+dc[k];
            if(nr>=0 && nc>=0 && nr<board.length && nc<board[0].length && board[nr][nc]=='O' && vis[nr][nc]==0) {
                dfs(board,vis,nr,nc,dr,dc);
            }
        }
    }
}