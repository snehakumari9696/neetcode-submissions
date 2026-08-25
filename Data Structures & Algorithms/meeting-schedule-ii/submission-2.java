/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals==null || intervals.size()==0){return 0;}

        int n=intervals.size();
        int[]start= new int[n];
        int[]end= new int[n];

        for(int i=0; i<n;i++){
            start[i]= intervals.get(i).start;
            end[i]= intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int sp=0;
        int ep=0;
        int usedRooms=0;

       while(sp<n){
        if(start[sp]>=end[ep]){
            
            sp++;
            ep++;
        }else{
            usedRooms++;
            sp++;
    }
       }
    return usedRooms;

    }
}
