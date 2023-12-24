// Doubling the value

class Solution{
    long solve(int n, long A[], long b){
        for (int i = 0;i < n;i++)
        {
            if (A[i] == b){
                b = b * 2;
            }
        }  
        return b;
    }
}
