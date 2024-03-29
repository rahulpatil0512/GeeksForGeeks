// Longest Common Substring

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        int dp[][]=new int[1001][1001];
        for (int i = 0; i < n; ++i){
            dp[i][0] = 0;
        }
        for (int i = 0; i < m; ++i){
            dp[0][i] = 0;
        }
        int res = 0;  
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= m; ++j){
                if (S1.charAt(i - 1) == S2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = 0;
                }
                res = Math.max (res, dp[i][j]);  
            }
        }
        return res;
    }
}
