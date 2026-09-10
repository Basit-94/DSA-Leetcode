class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE,count=0;

        for(int i=0;i<text.length();i++)
        {
            char c = text.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);  
        }
        /*for(int i=0;i<text.length();i++)
        {
            char c = text.charAt(i);
            if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n')
            {
                count++;
                min = Math.min(min,map.get(c));
            }
        }
        if(count>=7)
            return min;

        return 0;*/

        char a[] = {'b','a','l','o','n'};
        for(int i=0;i<5;i++)
        {
            if(i!=2 && i!=3)
            {
                count = map.getOrDefault(a[i],0);
            }
            else
            {
                count = map.getOrDefault(a[i],0)/2;
            }

            min = Math.min(min,count);
        }

        return min;
    }
}