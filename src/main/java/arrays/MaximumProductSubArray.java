package arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));
    }

    // Two pass solution
    public static int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;

        int product=1;

        for(int num : nums){
            product *= num;
            max = Math.max(product,max);
            if(product == 0)product = 1;

        }

        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            product *= nums[i];
            max = Math.max(product,max);
            if(product ==0) product = 1;
        }

        return max;
    }
}
