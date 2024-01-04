// Intersection of two arrays

class Solution {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> s1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) s1.add(a[i]);
        for (int i = 0; i < m; i++) {
             if (s1.contains(b[i])) {
                s1.remove(b[i]);
                count++;
            }
        }
        return count;
    }
}
