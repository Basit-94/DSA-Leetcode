class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0,r,max,i;
        r=cardPoints.length-1;
        for(i=0;i<k;i++)
        {
            l = l+cardPoints[i];
        }
        max = l;
        for(i=k-1;i>=0;i--)
        {
            l = l-cardPoints[i]+cardPoints[r--];
            max = Math.max(max, l);
            
        }
        return max;
    }
}
