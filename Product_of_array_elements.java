// Product of array elements

class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        Long ans = 1L;
        for(int i=0; i<n; i++){ 
            arr[i]=arr[i]%mod;
            ans = (ans*arr[i])%mod;
        }
        return ans;
    }
}
