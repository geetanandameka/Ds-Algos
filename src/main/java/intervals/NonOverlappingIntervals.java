package intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        eraseOverlapIntervals( intervals);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int count =0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }
}
