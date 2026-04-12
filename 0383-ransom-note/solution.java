class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i,c1=0;
        HashMap<Character,Integer>set = new HashMap<>();
        for(i=0;i<magazine.length();i++)
        {
            set.put(magazine.charAt(i),set.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(i=0;i<ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            if(set.containsKey(c))
            { 
                if(set.get(c)-1<0)
                {
                    return false;                   
                }
                set.put(c,set.get(c)-1);
                c1++;
            }
        }
        if(c1==ransomNote.length())
        {
            return true;
        }
        return false;
    }
}
