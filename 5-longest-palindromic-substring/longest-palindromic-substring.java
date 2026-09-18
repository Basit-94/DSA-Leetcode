class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1 || isPalin(0,s.length()-1,s))
        {
            return s;
        }

        int l=0,r=1,max1=0,max2=0;

        while(l<r && r<s.length())
        {
            if(isPalin(l,r,s))
            {
                if((r-l+1)>(max2-max1+1))
                {
                    max1 = l;
                    max2 = r;
                }
            }

            if((r+1)==s.length())
            {
                l++;
                r = l+1;
            }
            else
            {
                r++;
            }
        }

        return s.substring(max1,max2+1);
    }
    private boolean isPalin(int s,int e,String c)
    {

        while((s<c.length() && e>=0) && (c.charAt(s)==c.charAt(e)))
        {
            s++;
            e--;
        }
        return (s>e);

        /*String k=c.substring(s,e+1);
        String rev = new StringBuilder(k).reverse().toString();
        if(k.equals(rev))
        {
            return k;
        }
        return "";*/
    }
}