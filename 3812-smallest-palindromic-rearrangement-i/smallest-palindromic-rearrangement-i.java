class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }

        StringBuilder left = new StringBuilder();
        char mid = '\0';

        for(int i=0;i<26;i++)
        {
            char c = (char)('a'+i);
            for(int j=0;j<freq[i]/2;j++)
            {
                left.append(c);
            }
            if(freq[i]%2!=0)
            {
                mid = (char)('a'+i);
            }
        }
        StringBuilder right = new StringBuilder(left);
        right.reverse();

        return left.toString()+(mid=='\0' ? "" :mid)+right.toString();
    }
}