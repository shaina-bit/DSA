//question- find the max sub array
//concept- Kadane's Algorithm
//time complexity- O(n)
//Space complexity- O(1)

public class maxSubarray {
    public int maxSubArray(int[] nums){
        int currentSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            //decide:extend or start fresh
            currentSum= Math.max(currentSum, currentSum+nums[i]);
            //keep track of the max sum
            maxSum= Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
