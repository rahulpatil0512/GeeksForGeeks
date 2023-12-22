// LCM And GCD

class Solution {
    static Long gcd(Long a, Long b)
    {
        if(a == 0)
          return b;
          
        return gcd(b%a, a);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] arr = new Long[2];
        Long g = gcd(A,B);    
        Long l = (A*B)/g;     
        arr[0] = l;
        arr[1] = g;
        return arr;
    }
};
