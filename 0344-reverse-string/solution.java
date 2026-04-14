class Solution {
    public void reverseString(char[] s) {
        char t;
        int l=0,r=s.length-1;
        while(l<r)
        {
            t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
        //System.out.println(Arrays.toString(s));
    }
}
