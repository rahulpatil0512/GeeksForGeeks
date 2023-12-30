// Count the number of possible triangles

class Solution{
    static int findNumberOfTriangles(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n-2; i++){
            int k = i+2;
            for (int j = i+1; j < n; ++j){
                while (k < n && arr[(int)i] + arr[(int)j] > arr[(int)k])
                    ++k;
                count += k - j - 1;
            }
        }
        return count;
    }
}
