class Solution {
    public int maxVowels(String s, int k) {
        int left=0,right=0,count=0,max=0;
        while(right<s.length() && left<=right)
        {
            if(right<s.length() && (right-left+1)<=k)
            {
                char c = s.charAt(right);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    count++;
                }
            }
            if(left<s.length() && (right-left+1)==k)
            {
                max = Math.max(max,count);
                
                char c = s.charAt(left);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    count--;
                }
                left++;
            }
            right++;
        }

        return max;
    }
}