class Solution {
    public int leastInterval(char[] tasks, int n) {
        Queue<int[]>q = new LinkedList<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> b - a);
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<tasks.length;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        for (int value : map.values()) 
        {
            pq.offer(value);
        }

        int time = 0;
        while(pq.size()>0 || q.size()>0)
        {
            time++;
            if(q.size()>0 && q.peek()[1]==time)
            {
                int front[] = q.poll();
                pq.offer(front[0]);
            }

            if(pq.size()>0)
            {
                int freq = pq.poll();
                freq--;
                if(freq>0)
                {
                    q.offer(new int[]{freq,time+n+1});
                }
            }
        }

        return time;
    }
}