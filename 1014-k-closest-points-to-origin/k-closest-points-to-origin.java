class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b) ->  (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        for(int i=0;i<points.length;i++)
        {
            if(i<k)
            {
                pq.offer(points[i]);
            }
            else
            {
                if(Math.pow(pq.peek()[0],2) + Math.pow(pq.peek()[1],2) > (Math.pow(points[i][0],2)+Math.pow(points[i][1],2)))
                {
                    pq.poll();
                    pq.offer(points[i]);
                }
            }
        }

        int a[][] = new int[k][2];
        for(int i=0;i<k;i++)
        {
            a[i] = pq.poll();
        }

        return a;
    }
}