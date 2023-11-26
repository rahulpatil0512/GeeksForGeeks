// Find the fine

class Solution {
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long res = 0;
        if(date%2==0){
            for(int i=0; i<n; i++){
                if(car[i]%2!=0){
                    res+=Math.abs(fine[i]);
                }
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(car[i]%2==0){
                    res+=Math.abs(fine[i]);
                }
            }
        }
        return res;
    }
}
