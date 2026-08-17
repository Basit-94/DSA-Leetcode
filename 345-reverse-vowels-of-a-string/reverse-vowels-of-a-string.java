class Solution {
    public String reverseVowels(String s) {
        int left=0,right=s.length()-1;
        char a[] = s.toCharArray();
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        while(left<right)
        {
            if(!vowels.contains(a[left]))
            {
                left++;
            }
            if(!vowels.contains(a[right]))
            {
                right--;
            }
            if(vowels.contains(a[left]) && vowels.contains(a[right]))
            {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }

        return new String(a);
    }
}