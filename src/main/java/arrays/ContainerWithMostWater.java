package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {

    }
    public static int maxArea(int[] height) {
        int max_area = 0;
        int start =0;
        int end = height.length-1;
        while(start<end){
            int curr_area=0;
            if(height[start]<height[end]){
                curr_area = (end-start)*(height[start]);
            } else {
                curr_area = (end-start)*(height[end]);
            }
            max_area = Math.max(max_area,curr_area);
        }
        return max_area;
    }
}
