// Maximize Toys

class Solution{
    static int toyCount(int N, int K, int arr[]){
        Arrays.sort(arr);
        int sum = 0, i;
        for(i = 0; i < N; i++){
            if(sum + arr[i] > K){
               break; 
            }
            sum += arr[i];
        }
        return i;
    }
}
