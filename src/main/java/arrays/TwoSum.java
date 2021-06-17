package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
//        System.out.println(Arrays.toString(calculateSortedArrayTwoSum(nums, target)));
        System.out.println(Arrays.toString(calculateUnSortedTwoSum(nums, target)));

    }

    public static int[] calculateUnSortedTwoSum(int[] nums, int target){
        Map<Integer,Integer> respMap = new HashMap<>();
        int[] respArray = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(respMap.containsKey(diff)){
                respArray[0]=i;
                respArray[1]=respMap.get(diff);
            } else {
                respMap.put(nums[i], i);
            }
        }
        return respArray;
    }
    public static int[] calculateSortedArrayTwoSum(int[] nums, int target){

        int[] resp = new int[]{-1,-1};
        int start=0;
        int end = nums.length-1;

        while(start<end){
            if(nums[start]+nums[end]==target){
                resp[0]=start;
                resp[1]=end;
                break;
            } else if(nums[start]+nums[end]<target){
                start++;
            } else {
                end--;
            }
        }
        return resp;
    }
}
