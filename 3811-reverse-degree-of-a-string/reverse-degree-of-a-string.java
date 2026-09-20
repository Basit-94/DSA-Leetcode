class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            sum = sum+(i+1)*Math.abs((int)c - 123);
        }

        return sum;
    }
}