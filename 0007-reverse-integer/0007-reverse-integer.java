class Solution {
    public int reverse(int x) {
        int num = 0;
        while(Math.abs(x) > 0) {
            // check before overflow: should divide by 10.0 instead of 10 because of integer division of Java
            if (num > (Integer.MAX_VALUE - Math.abs(x)%10)/10.0 
                || num < (Integer.MIN_VALUE + Math.abs(x) % 10) /10.0) {
                return 0;
            }
            num = num *10 + x % 10;
            x = x/10;
        }
        return num;
    }
}