class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE,count=0;

        for(int i=0;i<text.length();i++)
        {
            char c = text.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);  
        }

        char a[] = {'b','a','l','o','n'};
        for(int i=0;i<5;i++)
        {
            count = map.getOrDefault(a[i],0);
            if(i==2 || i==3)
            {
                count = count/2;
            }

            min = Math.min(min,count);
        }

        return min;
    }
}