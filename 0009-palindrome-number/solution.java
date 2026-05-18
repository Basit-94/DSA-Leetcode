class Solution {
    public boolean isPalindrome(int x) {
        String s;
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        s = sb.toString();
        StringBuilder r = new StringBuilder(sb.reverse());
        if(s.equals(r.toString()))
        {
            return true;
        }
        return false;
    }
}
