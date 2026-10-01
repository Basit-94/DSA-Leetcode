class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0,right = s.length()-1; 
        while(left<right) {
            while(!Character.isLetterOrDigit(s.charAt(left)) && (left<right) ) {
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right)) && (left<right) ) {
                right--;
            }

            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


        /*s = s.toLowerCase();
        StringBuilder st = new StringBuilder("");
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int a = (int)c;
            if((a>=97 && a<=122) || Character.isDigit(c)) {
                st.append(c);
            }
        }
        StringBuilder s1 = new StringBuilder(st);
        
        if((st.reverse().toString()).equals(s1.toString()) || st.length()==0) {
            return true;
        }
        return false;*/
    }
}