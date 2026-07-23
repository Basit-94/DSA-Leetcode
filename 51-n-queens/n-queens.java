class Solution {

    List<List<String>>result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char b[][] = new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(b[i],'.');
        }

        backtrack(b,0);
        return result;
    }
    boolean issafe(char b[][],int r,int c)
    {
        int i=0,j=0;
        for(i=r-1;i>=0;i--)
        {
            if(b[i][c]=='Q')
            {
                return false;
            }
        }
        for(i=r-1,j=c-1;i>=0 && j>=0;i--,j--)
        {
            if(b[i][j]=='Q')
            {
                return false;
            }
        }
        for(i=r-1,j=c+1;i>=0 && j<b.length;i--,j++)
        {
            if(b[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    void backtrack(char b[][],int r)
    {
        if(r==b.length)
        {
            List<String>temp = new ArrayList<>();
            for(int i=0;i<r;i++)
            {
                temp.add(new String(b[i]));
            }
            result.add(temp);
            return;
        }

        for(int c=0;c<b.length;c++)
        {
            if(issafe(b,r,c))
            {
                b[r][c] = 'Q';
            

            backtrack(b,r+1);

            b[r][c] = '.';
            }
        }
    }
}