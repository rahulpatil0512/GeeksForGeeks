// Index Of an Extra Element

class Solution {
    public int findExtra(int a[], int b[], int n) {
        int index = n-1;  
        int left = 0, right = n - 2; 
        while (left <= right) 
        { 
            int mid = (left+right) / 2; 
            if (b[mid] == a[mid]) 
                left = mid + 1; 
            else
            { 
                index = mid; 
                right = mid - 1; 
            } 
        } 
        return index; 
    }
}
