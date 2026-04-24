class Solution {
    public int characterReplacement(String s, int k) {
        int mf=0,r,n=s.length(),l=0,res=0;char c;
        
        int f[] = new int[26];
        for(r=0;r<n;r++)
        {
            c = s.charAt(r);
            f[c-'A']++;

            mf = Math.max(mf, f[c-'A']);

            if(r-l+1-mf>k)
            {
                f[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }

        return res;
    }
}
