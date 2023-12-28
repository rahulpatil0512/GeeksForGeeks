// Rotate Array

class Solution
{
    static void rotateArr(int arr[], int d, int n){
        d=d%n ; 
        int b[] = new int[d] ; 
        for(int i=0;i<d;i++){ 
            b[i] = arr[i] ; 
        } 
        for(int i=0;i<arr.length-d;i++){ 
            arr[i]=arr[i+d] ; 
        } 
        for(int i=n-d;i<arr.length;i++){ 
            arr[i] = b[i-n+d] ; 
        } 
    }
}
