// Find the closest pair from two arrays

class Solution{
	public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x){
        int temp = n;
        n = m;
        m = temp;
        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
        int l = 0, r = n-1;
        while (l<m && r>=0){
            if (Math.abs(arr[l] + brr[r] - x) < diff){
              res_l = l;
              res_r = r;
              diff = Math.abs(arr[l] + brr[r] - x);
            }
            if (arr[l] + brr[r] > x){
                r--;
            }
            else{
                l++;
            }  
        }
        ArrayList<Integer> v = new ArrayList<>();
        v.add(arr[res_l]);
        v.add(brr[res_r]);
        return v;
    }
}
