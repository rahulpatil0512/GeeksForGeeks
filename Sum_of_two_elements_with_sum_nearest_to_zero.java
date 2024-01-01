// Sum of two elements with sum nearest to zero

class Solution{
    public static int closestToZero (int arr[], int n){
        Arrays.sort(arr);   
    	int i = 0, j = n - 1;
    	int sum = arr[i] + arr[j];  
    	int diff = Math.abs (sum);  
    	while (i < j){
     		if (arr[i] + arr[j] == 0){
     		    return 0;
     		}
    		if (Math.abs (arr[i] + arr[j]) < Math.abs (diff)){
    			diff = (arr[i] + arr[j]);
    			sum = arr[i] + arr[j];
    		}
    		else if (Math.abs (arr[i] + arr[j]) == Math.abs (diff)){
    		    sum = Math.max(sum,arr[i] + arr[j]);
    		}
     		if (arr[i] + arr[j] > 0){
     		    j--;
     		}
     		else{
     		    i++;
     		}
    	}
    	return sum;
    }
}
