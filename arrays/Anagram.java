//question- check if two strings are anagram or not
// two strings are anagrams if:
// They contain exactly the same characters
// With exactly the same frequency
// But possibly in different order

//no hashmap solution
public class Anagram {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length())
           return false;
        
        int [] count=new int [26];
        //count characters in s
        // First loop = fill buckets (add)
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)- 'a']++;
        }
        //substract characters in t
        //Second loop = empty buckets (subtract)
        for(int i=0;i<t.length();i++){
            count[s.charAt(i)-'a']--;
        }
        // If any count is not zero → not anagram
        for(int n:count){
            if(n!=0) return false;
        }
        return true;
    }
}
//time complexity- O(n)
//Space complexity-O(1)
// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
// answer: we will use hashmaps
