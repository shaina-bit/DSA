//question- Two Sum
//Time complexity- O(n^2)
//Space complexity- O(1)
//i didn't use hash maps because i am not familiar with it yet

class Solution{
    public int[] twoSum(int nums[], int target){
        //two loops->check every pair
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    // Create a new array, put i and j inside it, and return it.
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{}; // add a return statement to avoid compilation error
    }
}