package arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>(); // if nums less than 3 element
        Arrays.sort(nums); // sort array
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int start= i+1; int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                } else if(sum>0){
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
