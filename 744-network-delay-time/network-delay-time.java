class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        
        for(int i=0;i<=n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++) {
            adj.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }

        int dist[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> Integer.compare(a[1],b[1]) );

        dist[k] = 0;
        pq.add(new int[]{k,0});

        while(!pq.isEmpty()) {
            int arr[] = pq.poll();
            int u = arr[0];
            int d = arr[1];
            if(d>dist[u]) {
                continue;
            }

            for(int x[] : adj.get(u)) {
                if(d+x[1]<dist[x[0]]) {
                    dist[x[0]] = d+x[1];
                    pq.add(new int[]{x[0],dist[x[0]]});
                }
            }
        }
        int max = 0;
        for(int i=1;i<=n;i++) {
            if(dist[i]==Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max,dist[i]);
        }

        return max;
    }
}