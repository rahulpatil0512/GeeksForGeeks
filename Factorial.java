// Factorial

class Solution{
    static long factorial(int N)        
    {
        long ans = 1; 
        for(int i = 2; i <= N; i++){
            ans = ans*i; 
        }  
        return ans;
    }
}
