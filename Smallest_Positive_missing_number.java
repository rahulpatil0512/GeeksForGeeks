// Smallest Positive missing number

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int A[], int n)
    {
        for(int i = 0; i < n; ++ i) {
            while(A[i] >= 1 && A[i] <= n && A[i] != A[A[i]-1])
                // swap(A[i], A[A[i] - 1]);
                {
                    int t = A[A[i] - 1]; A[A[i] - 1] = A[i];  A[i]=t;
                }
        }
        for(int i = 0; i < n; ++ i)
            if(A[i] != i + 1)
                return i + 1;
        
        return n + 1;
    }
}
