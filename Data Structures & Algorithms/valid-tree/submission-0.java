class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1){return false;}
        List<List<Integer>> adj= new ArrayList<>();
       
       for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
       }

       for(int[]edge: edges){
        int u=edge[0];
        int v=edge[1];

        adj.get(u).add(v);
        adj.get(v).add(u);
        }

        Queue<Integer> queue= new LinkedList<>();
        boolean[]visited = new boolean[n];
        
        queue.add(0);
        visited[0]=true;
        int count=1;

        while(!queue.isEmpty()){
            int curr=queue.poll();

            for(int neighbor: adj.get(curr)){
                if(!visited[neighbor]){
                    
                    queue.add(neighbor);
                    visited[neighbor]=true;
                    count++;


                }
            }
        }
        return count==n;

        


        

    }
}
