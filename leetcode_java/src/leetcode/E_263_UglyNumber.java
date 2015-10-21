package leetcode;

public class E_263_UglyNumber {
    public boolean isUgly(int num) {
        if(num == 0) return false;
        if(num >= 0 && num < 5) return true;
        while(num % 2 == 0){ num = num / 2;}
        while(num % 3 == 0){ num = num / 3;}
        while(num % 5 == 0){ num = num / 5;}
        return num == 1;
    }
}
