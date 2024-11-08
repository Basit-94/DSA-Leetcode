class Solution {
    public boolean isBalanced(String num) {
        int l = num.length();
        int i,se,so,p=0;
        char c;
        String s1="";
        i=se=so=0;     
        for(i=0;i<l;i++)
        {
            c = num.charAt(i);
            s1 = c+"";
            p = Integer.parseInt(s1);
            if(i%2==0)
            {
                se = se+p;
            }
            else
            {
                so = so+p;
            }
        }
        System.out.println("se="+se);
        System.out.println("so="+so);
        if(se==so)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
