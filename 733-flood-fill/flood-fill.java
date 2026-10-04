class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        int vis[][] = new int[image.length][image[0].length];
        dfs(image, sr, sc, color, old,vis);

        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int color,int old,int vis[][]) {
        if(sr>=0 && sr<image.length && sc>=0 && sc<image[0].length && image[sr][sc]==old && vis[sr][sc]!=1) {
            image[sr][sc] = color;
            vis[sr][sc] = 1;
        }
        else {
            return;
        }

        dfs(image, sr+1, sc, color,old,vis);
        dfs(image, sr-1, sc, color,old,vis);
        dfs(image, sr, sc+1, color,old,vis);
        dfs(image, sr, sc-1, color,old,vis);
    }
}