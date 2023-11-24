// Largest Element in Array

class Compute {
    public int largest(int arr[], int n)
    {
        int large = arr[0];
        for(int i = 0; i<n; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        return large;   
    }
}
