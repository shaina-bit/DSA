//question- find the longest common prefix
//time and space complexity- O(n*m) and O(1)

package DSA.strings;
public class longestPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){  //will return "" if no common longest prefix
            return "";
        }
        String prefix=strs[0];  //first string
        for(int i=1;i<strs.length;i++){  //compare prefix with each word
            while(strs[i].indexOf(prefix)!=0){  //keep shrinking prefix until it fits
                prefix= prefix.substring(0,prefix.length()-1); //shrink by removing the last character

                if(prefix.isEmpty()){  //this means no cmmon prefix
                    return "";
                }
            }
        }
        return prefix;
    }
}
