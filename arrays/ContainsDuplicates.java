//question: find duplicates
//time complexity: O(n^2)
//time complexity could be better by using hash maps
//space complexity: O(1)-> no extra space

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;   // duplicate found
                }
            }
        }

        return false;  // no duplicates
    }
}
