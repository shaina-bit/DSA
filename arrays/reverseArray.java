//question- Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//trick-1.)reverese the  entire array 2.)reverse first k elements
//reverse remaining elements
public class reverseArray{
    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // handle cases where k > n
        
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
}

//time complexity-O(n)
//space complexity-O(1)