// Minimum element in a sorted and rotated array

class Solution {
    public int findMinUtil(int[] arr, int low, int high) {
         if (arr[low] < arr[high]) {
            return arr[low];
        }
         if (high == low + 1 && arr[low] > arr[high]) {
            return arr[high];
        }
        int mid = low + (high - low) / 2;
         if (mid > low && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return arr[mid + 1];
        }
        if (arr[high] > arr[mid]) {
            return findMinUtil(arr, low, mid - 1);
        }
        return findMinUtil(arr, mid + 1, high);
    }
    public int findMin(int[] arr, int n) {
        return findMinUtil(arr, 0, n - 1);
    }
}
