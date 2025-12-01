//question- find the index of the first occurence
//time and space complexity- O(n*m) and 0(1)
//there is other algorithm called KMP, we will do that later)
package DSA.strings;
public class indexOfFirstOccur {
    public int strStr(String haystack, String needle) {
        
        int n = haystack.length();
        int m = needle.length();

        // If needle is longer than haystack then no match.
        if (m > n) return -1;

        // starting at every possible index
        for (int i = 0; i <= n - m; i++) {
            // if substring matches needle
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;  // first match found
            }
        }

        return -1; // no match found
    }
}
