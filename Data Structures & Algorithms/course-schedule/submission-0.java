class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree=new int[numCourses];
        for(int[]req : prerequisites){
            
            int course=req[0];
            int preReq= req[1];

            adj.get(preReq).add(course);
            indegree[course]++;
        }
        
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        int count=0;
        while(!queue.isEmpty()){
            int current=queue.poll();
            count++;

            for(int dependant: adj.get(current)){
            indegree[dependant]--;

            if(indegree[dependant]==0){
                queue.add(dependant);
            }

            
        }
        }
        
        return count==numCourses;
    }
}
