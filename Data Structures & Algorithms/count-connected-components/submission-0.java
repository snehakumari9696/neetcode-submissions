class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[]visited= new boolean[n];
        int count=0;

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;

                Queue <Integer> queue= new LinkedList<>();
                queue.add(i);
                visited[i]=true;
                while(!queue.isEmpty()){
                    int curr=queue.poll();

                    for(int neighbor: adj.get(curr)){
                        if(!visited[neighbor]){
                        queue.add(neighbor);
                        visited[neighbor]=true;
                        

                        }
                        
                    }
                }
            }
        }
        return count;

    }
}
