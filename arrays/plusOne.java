//question- increase the larger integer by 1 (problem no- 66)
//time and space complexity- O(n) and O(1)

class plusOne{
    public int[] increaseOne(int[] digits){  //using int[]-> returning an array
           for(int i=digits.length-1;i>=0;i--){  //from right to left
            if(digits[i]<9){     //if digit is less than 9 then simply plus one
                digits[i]++;
                return digits;
            }
            digits[i]=0;       //if the digit is 9 then we will set 0 there 
        }
        int[] result= new int[digits.length+1];  //if all the digits are 9, then new array will have to be made 
        result[0]=1;
        return result;
    }

}