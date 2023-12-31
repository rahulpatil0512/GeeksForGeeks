// Common elements

class Solution 
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int last = Integer.MIN_VALUE;
        while (i < n1 && j < n2 && k < n3)
        {
            if (A[i] == B[j] && A[i] == C[k] && A[i] != last) 
            {
                res.add (A[i]);
                last = A[i];
                i++;
                j++;
                k++;
            }
            else if (Math.min (A[i], Math.min(B[j], C[k])) == A[i]){
                i++;  
            } 
            else if (Math.min (A[i], Math.min(B[j], C[k])) == B[j]){
                j++;
            } 
            else{
                k++;
            } 
        }
        return res;
    }
}
