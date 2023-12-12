// Fibonacci Series up to Nth term

class Solution {
    long[] Series(int N) {
        long fib[] = new long[N + 1];
        if (N == 0) {
            return fib;
        }
        if (N == 1) {
            fib[1] = 1;
            return fib;
        }
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
