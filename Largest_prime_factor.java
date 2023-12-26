// Largest prime factor

class Solution{
    static long largestPrimeFactor(int N){ 
        long num = 2;
        while ((num * num) <=N){
            if (N % num == 0){  
                N /= num;  
            }
            else{
                num++;
            }
        }
        return N;
    }
}
