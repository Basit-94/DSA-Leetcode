class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1,c=0;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
            c++;
        }

        return c;

        /*String words[] = s.split(" ");
        return words[words.length-1].length();*/
    }
}