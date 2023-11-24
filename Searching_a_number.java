// Searching a number

class Solution {
    public int search(int arr[], int n, int k) {

        // code here
        int pos=0;
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                pos = i+1;
                return pos;
            }
        }
        return -1;
    }
}
