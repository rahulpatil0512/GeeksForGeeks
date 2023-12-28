// Find first set bit

class Solution
{
    public static int getFirstSetBit(int n){
        if(n==0){
            return 0;
        }
        return (int)(Math.log(n&-n)/Math.log(2.0)) + 1;
    }
}
