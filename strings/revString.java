//question- reverse a string 
//time and space complexity- O(n) and O(1)

package DSA.strings;

public class revString {
    public void reverseString(char[] s){
        int left=0;
        int right= s.length-1;

        while(left<right){
            char temp= s[left];
            s[left]= s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
}
