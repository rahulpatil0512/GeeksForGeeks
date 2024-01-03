// Sum of elements between k1'th and k2'th smallest elements

class Solution { 
    public static long sumBetweenTwoKth(long a[], long n, long k1, long k2){
        Arrays.sort(a);
        Set<Long> s = new HashSet<Long>();
        long c = 0, sum = 0;
        if(k1>k2)
        {
            long temp = k1;
            k1 = k2;
            k2 = temp;
        }
        for(int i=0;i<n;i++){
            if(s.contains(a[i]) == false){
                s.add(a[i]);
                c++;
            }
            if(c > k1 && c < k2){
                sum+=a[i];
            }
            if(c == k2){
                break;
            }
        }
        return sum;
    }
}
