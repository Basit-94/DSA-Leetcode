class Solution {
    public int findCircleNum(int[][] isConnected) {
        int c=0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<isConnected.length;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected.length;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[] = new int[isConnected.length];

        for(int i=0;i<isConnected.length;i++)
        {
            if(vis[i]==0)
            {
                c++;
                dfs(i,adj,vis);
            }
        }

        return c;
    }
    private void dfs(int i,ArrayList<ArrayList<Integer>> adj,int vis[])
    {
        vis[i] = 1;
        for(Integer it : adj.get(i))
        {
            if(vis[it]==0)
            {
                dfs(it,adj,vis);
            }
        }
    }
}