// Floor in a Sorted Array

class Solution{
    static int findFloor(long arr[], int low, int high, long x){
        if (low > high){
            return -1; 
        }
        if (x >= arr[high]) {
            return high;
        }
        int mid = (low+high)/2; 
        if (arr[mid] == x){
            return mid;
        }
        if (mid > 0 && arr[mid-1] <= x && x < arr[mid]){
            return mid-1;
        } 
        if (x < arr[mid]){
            return findFloor(arr, low, mid - 1, x);
        } 
        return findFloor(arr, mid + 1, high, x); 
    }
    static int findFloor(long arr[], int n, long x)
    {
        return findFloor(arr, 0, n-1, x);
    }
}
