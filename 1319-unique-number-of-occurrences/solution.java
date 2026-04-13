class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       int i;
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        for(i=0;i<arr.length;i++)
        {
            map.put(arr[i],(map.getOrDefault(arr[i],0))+1);
        }
        i=0;
        for(int num : map.values())
        {
            if(set.contains(num))
            {
                return false;
            }
            set.add(num);
        }
        return true; 
    }
}
