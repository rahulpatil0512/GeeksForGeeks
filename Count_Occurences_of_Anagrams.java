// Count Occurences of Anagrams

class Solution {
    final int MAX = 256;
    boolean compare(char arr1[], char arr2[]) {
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i]) return false;
        return true;
    }
    int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
        int ans = 0;
        for (int i = M; i < N; i++) {
            if (compare(countP, countTW)) ans++;
            (countTW[txt.charAt(i)])++;
            countTW[txt.charAt(i - M)]--;
        }
        if (compare(countP, countTW)) ans++;
        return ans;
    }
}
