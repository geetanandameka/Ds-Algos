package arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums){
        int product =1;
        int[] resp = new int[nums.length];
        resp[0]=1;
        for(int i=1;i<nums.length;i++){
            product = product* nums[i-1];
            resp[i]= product;
        }
        product =1;
        for(int i=resp.length-2;i>=0;i--){
            product=product*nums[i+1];
            resp[i]=product*resp[i];
        }
        System.out.println(Arrays.toString(resp));
        return nums;
    }
}
