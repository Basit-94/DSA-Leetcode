class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char c = word.charAt(0);
        boolean[][] visited = new boolean[m][n];
        int count=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c==board[i][j])
                {
                    if(backtracking(board,word,i,j,count,visited))
                    {
                        return true;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }

        return false;
    }

    boolean backtracking(char b[][],String w,int i,int j,int count,boolean visited[][])
    {
        if(count==w.length())
        {
            return true;
        }
        if(i < 0 || i >= b.length || j < 0 || j >= b[0].length)
        {
            return false;
        }
        if(b[i][j]!=w.charAt(count) || visited[i][j])
        {
            return false;
        }
        visited[i][j] = true;
        boolean found = backtracking(b,w,i,j+1,count+1,visited)
                    ||  backtracking(b,w,i,j-1,count+1,visited)
                    ||  backtracking(b,w,i+1,j,count+1,visited)
                    ||  backtracking(b,w,i-1,j,count+1,visited);
        visited[i][j] = false;

        return found;

    }

}