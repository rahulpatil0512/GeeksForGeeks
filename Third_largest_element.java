// Third largest element

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int third_largest_no;
	    Arrays.sort(a);
	    if(n>2){
	        third_largest_no = a[n-3];
	        return third_largest_no;
	    }
	    else{
	        return -1;
	    }
    }
}
