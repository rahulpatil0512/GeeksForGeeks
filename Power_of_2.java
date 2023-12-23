// Power of 2

class Solution{
    public static boolean isPowerofTwo(long n){
        if(n == 1){
            return true;
        } 
        if(n%2 != 0 || n <= 0){
            return false;
        } 
        return isPowerofTwo(n/2);
    }
}
