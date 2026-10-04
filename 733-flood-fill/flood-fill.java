class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        dfs(image, sr, sc, color, old);

        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int color,int old) {
        if(sr>=0 && sr<image.length && sc>=0 && sc<image[0].length && image[sr][sc]==old && old!=color) {
            image[sr][sc] = color;
        }
        else {
            return;
        }

        dfs(image, sr+1, sc, color,old);
        dfs(image, sr-1, sc, color,old);
        dfs(image, sr, sc+1, color,old);
        dfs(image, sr, sc-1, color,old);
    }
}