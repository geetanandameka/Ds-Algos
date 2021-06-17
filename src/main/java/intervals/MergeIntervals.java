package intervals;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
    }
    public int[][] merge(int[][] intervals) {
        List<int[]> resp = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end = Math.max(intervals[i][1],end);
            }else {
                resp.add(new int[]{start,end});
                start=intervals[i][0];
                end = intervals[i][1];
            }
        }
        resp.add(new int[]{start,end});
        return resp.toArray(new int[resp.size()][]);
    }
}
