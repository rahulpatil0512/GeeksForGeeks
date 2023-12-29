// Insertion Sort

class Solution{
	static void insert(int arr[],int i){
		int key = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>key){
 			arr[j+1] = arr[j];
			j=j-1;
		}
 		arr[j+1]=key;
	}
  	public void insertionSort(int arr[],int n){
		int i;
		for(i=1;i<n;i++){
		    insert(arr,i);
		}
 		    
	}
	
}
