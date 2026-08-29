class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue <Integer>pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int num: map.keySet()){
            pq.add(num);
            if(pq.size()> k){
                pq.poll();
            }
        }
        int[]result= new int[k];
        for(int a=0; a<k; a++){
            result[a]= pq.poll();
        }
        return result;
        
    }
}
