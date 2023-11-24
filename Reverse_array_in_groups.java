// Reverse array in groups

class Solution {
    //Function to reverse every sub-array group of size k.
    
    void reverseGroup(ArrayList<Integer> arr, int n, int start, int end){
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i = 0; i<n; i+=k){
            if(i+k-1 < n){
                reverseGroup(arr, n, i, i+k-1);
            }
            else{
                reverseGroup(arr, n, i, n-1);
            }
        }
    }
}
