//question- find the majority element
//concept- Boyer Moore Voting
//time and space complexity- O(n) and O(1)

class majorityElement {
    public int majorityEl(int[] nums) {
        int candidate=0;  //this might be the majority
        int count=0;      //keeps track of how strongly our candidate is being supported
 
        for(int num:nums){
            if(count==0){     //no current leader->choose the current num
               candidate=num; //set the candidate
        }
//If current number supports the candidate → +1
// If current number opposes the candidate → -1
// Whenever support falls to 0 → we pick a new candidate.
        count+=(num==candidate) ? 1:-1;
    }
    return candidate;
  }
}