// Check if array is sorted

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        boolean res = true;
        for(int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                res= false;
                break;
            }
        }
        return res;
    }
}
