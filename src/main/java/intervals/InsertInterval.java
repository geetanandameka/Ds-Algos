package intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> array = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            int[] currInterval = intervals[i];
            if(currInterval[1] < newInterval[0]){
                array.add(currInterval);
            }else if(newInterval[1] < currInterval[0]){
                array.add(newInterval);
                newInterval = currInterval;
            }else{
                newInterval[0] = Math.min(newInterval[0], currInterval[0]);
                newInterval[1] = Math.max(newInterval[1], currInterval[1]);
            }
        }
        array.add(newInterval);
        return array.toArray(new int[array.size()][2]);
    }
}
