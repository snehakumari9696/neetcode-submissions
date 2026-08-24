class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result= new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[]currInterval = intervals[0];
        result.add(currInterval);

        if(intervals.length <=1){
            return intervals;
        }

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= currInterval[1]){
                currInterval [1] = Math.max(currInterval[1], intervals[i][1]);
            }else{
                currInterval= intervals[i];
                result.add(currInterval);
            }
        }

        return result.toArray(new int[result.size()][]);


        
    }
}
