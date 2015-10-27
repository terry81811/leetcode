package leetcode;

public class E_66_Plus_One {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }else if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        
        int[] newArr = new int[digits.length+1];
        newArr[0] = 1;
        for(int j = 0; j<digits.length; j++) {
            newArr[j+1] = digits[j];
        }
        return newArr;
        
    }
}
