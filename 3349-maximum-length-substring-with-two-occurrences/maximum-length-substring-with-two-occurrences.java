class Solution {
    public int maximumLengthSubstring(String s) {
        return window(s,0,0);
    }
    private int window(String s,int left,int right)
    {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(right<s.length())
        {
            char c = s.charAt(right);
            if(map.getOrDefault(c,0)<2)
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else
            {
                map.put(c,map.get(c)+1);
                while(left<right && map.get(c)>2)
                {
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
            }

            result = Math.max(result,right-left+1);
            right++;
        }

        return result;
    }
}