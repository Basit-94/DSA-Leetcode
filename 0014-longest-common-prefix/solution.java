class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s7="",min="",y="",w1="",q="",lcp="";
        int n,i,h=0,j,l=0,c=0;char c1;
        String s,s1="",s5="",w="",f="",v="";
        n = strs.length;
        String b[] = new String[n];
        min = strs[0];
        for(i=0;i<n;i++)
        {
            if(min.length()>strs[i].length())
            {
                min = strs[i];
            }
        }
        w = min;
        for(i=0;i<n;i++)
        {
            f = strs[i];    
            while((w.length())!=(f.length()))
            {
                f = word(f,s7);
            }
            b[i] = f;
            if((f.trim()).equals(w.trim()))
            {
                h=h+1;
            }
        }
        if(h==n)
        {
            lcp = f;
        }
        else
        {
            while(l!=n)
            {
            for(i=0;i<n;i++)
            {
                b[i] = word(b[i],s7);
                q = b[i];
            }            
            for(i=0;i<n;i++)
            {
                if(q.equals(b[i]))
                {
                    l++;
                }
            }            
            if(l!=n)
            {
                l=0;
            }
        }
        if(l==n)
        {
            if(q!="")
            lcp = q;
        }
        }
        return lcp;
        /*if(q=="")
        {
            System.out.println("\""+"\"");   
        }*/
    }    
    static String word(String x,String s4)
    {
        for(int j=0;j<(x.length()-1);j++)
        {
            s4 = s4+x.charAt(j);
        }
        x = s4;
        s4 = "";
        return x;
    }
}
