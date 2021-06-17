package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> dupSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(dupSet.contains(nums[i])){
                return true;
            } else {
                dupSet.add(nums[i]);
            }
        }
        return false;
    }
}
