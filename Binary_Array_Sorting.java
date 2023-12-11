// Binary Array Sorting

class Solution
{
    static void binSort(int A[], int N)
    {
        int low = 0, high = N-1;
        while(low <=  high){
            if(A[low] == 0){
                low++;
            }
            else if(A[high] == 1){
                high--;
            }
            else{
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
                low++;
                high--;
            }
        }
    }
}

