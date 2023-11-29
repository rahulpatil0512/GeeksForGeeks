// Minimum Integer

class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        int mmin = Integer.MAX_VALUE;
        long sum = 0;
        for(int i : A)
            sum += i;
        for(int X : A)
            if(((long)X*N) >= sum && mmin > X)
                {
                    mmin = X;
                }
        return mmin;
    }
}
