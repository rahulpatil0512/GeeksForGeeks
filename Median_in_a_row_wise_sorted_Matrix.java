// Median in a row-wise sorted Matrix

class Solution {
    int median(int matrix[][], int R, int C) {
         int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < R; i++) {
            if (matrix[i][0] < min){
                min = matrix[i][0];
            }
            if (matrix[i][C-1] > max){
                max = matrix[i][C-1];
            }
        }
        int desired = (R * C + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            for (int i = 0; i < R; ++i) {
                int l = 0, r = C-1;
                while (l < r) {
                    int m = (l + r) / 2;
                    if (matrix[i][m] <= mid) {
                        l = m + 1;
                    } 
                    else {
                        r = m;
                    }
                }
                if (matrix[i][l] <= mid) {
                    place++;
                }
                place += l;
            }
            if (place < desired){
               min = mid + 1; 
            }
            else{
                max = mid;
            }
        }
        return min;
    }
}
