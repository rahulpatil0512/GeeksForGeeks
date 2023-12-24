// First and last occurrences of X

class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
         
        ArrayList<Integer> ret = new ArrayList<>();
        if(findIndex(arr, x, true)==-1) {
            ret.add(-1);
            return ret;
        }
        int first = findIndex(arr, x, true);
        int last = findIndex(arr, x, false);
        ret.add(first);
        ret.add(last);
        return ret;
    }
    int findIndex(int[] arr, int target, boolean isFirstIndex) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        int ans = -1;
        
        while(start<=end) {
            mid = start + (end-start)/2;
            if(arr[mid]==target) {
                ans = mid;
                if(isFirstIndex) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(arr[mid]>target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}
