//question- find the duplicate number
//concept- Linked list cycle,Floyd's cycle detection
//time complexity- O(n)
//space complexity- O(1)

public class findDuplicates {
    public int findDuplicate(int[] nums) {
        // Step 1: Find intersection point 
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // moves 1 step
            fast = nums[ nums[fast] ];  // moves 2 steps
        } while (slow != fast);

        // Step 2: Move slow to start, then move both 1 step
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;   // Start of cycle = duplicate number
    }
}

