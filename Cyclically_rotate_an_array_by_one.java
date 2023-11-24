// Cyclically rotate an array by one

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int x = arr[n-1];
        for(int i = n-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
    }
}
