// Index of first 1 in a sorted array of 0s and 1s

class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
       for(int i=0; i<n; i++){
           if(arr[i]==1){
               return i;
           }
       }
       return -1;
    }
}
