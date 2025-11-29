//question- convert roman numbers to integers
//logic- If current numeral < next numeral → subtract
//       else → add
//time and space complexity- O(n) and O(1)

package DSA.strings;
public class conversion {
    public int romanToInt(String s){
        int total=0;
        for(int i=0;i<s.length();i++){ //looping through each characters
            int current= value(s.charAt(i)); //convert current roman character to number 
            if(i+1<s.length()){
                int next= value(s.charAt(i+1));

                if(current<next){
                    total-=current;  //substarct case
                    continue;
                }
            }
            total+=current;  //add case
        }
        return total;
    }
    private int value(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }
}
