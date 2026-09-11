class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0,right=0,count=0;
        if(t.length()<s.length())
        {
            return false;
        }
        /*if(s.length()==0)
        {
            return true;
        }*/
        while(left<s.length() && right<t.length())
        {
            char c1 = s.charAt(left);
            char c2 = t.charAt(right);

            if(c1==c2)
            {
                count++;
                left++;
            }
            right++;
        }

        if(count==s.length())
        {
            return true;
        }
        return false;
    }
}