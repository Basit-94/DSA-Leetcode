class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        int result[] = new int[k];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            if(i<k)
            {
                pq.offer(entry.getKey());
            }
            else
            {
                if(map.get(pq.peek())<entry.getValue())
                {
                    pq.poll();
                    pq.offer(entry.getKey());
                }
            }
            i++;
        }

        for(i=0;i<k;i++)
        {
            result[i] = pq.poll();
        }
        return result;
    }
}