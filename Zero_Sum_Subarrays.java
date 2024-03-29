// Zero Sum Subarrays

class Solution{
    public static long findSubarray(long[] arr ,long n){
        long sum=0, counter=0; 
        HashMap<Long, Long>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                counter++;
            }
            if(mp.containsKey(sum)) {
               counter+=mp.get(sum);
            }
            if(mp.containsKey(sum)){
                long k=mp.get(sum);
                k++;
                mp.put(sum,k);
            }
            else{
                mp.put(sum,1L);
            }
        }
        return counter ;
    }
}
