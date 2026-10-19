class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) {
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,r=1,max=1;
        map.put(s.charAt(l),1);

        while(r<s.length()) {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            while(map.get(s.charAt(r)) > 1 ) {
                map.put(s.charAt(l),map.get(s.charAt(l)) - 1);
                l++;
            }

            max = Math.max(max,r-l+1);
            r++;
        }

        return max;
    }
}