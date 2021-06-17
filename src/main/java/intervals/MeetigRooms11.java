package intervals;

import java.util.Arrays;

public class MeetigRooms11 {

    public static void main(String[] args) {

    }
    public static int minMeetingRooms(int[][] intervals) {

        int[] starts = new int[intervals.length];
        int [] ends = new int [intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms =0; int endTime =0;

        for(int i=0;i<intervals.length;i++){
            if(starts[i]<ends[endTime]){
                rooms++;
            } else {
                endTime++;
            }
        }
        return rooms;
    }
}
