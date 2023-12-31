// Search in a row-column sorted Matrix

class Solution {
    static boolean search(int matrix[][], int n, int m, int x) {  
		int i = n - 1, j = 0; 
		while (i >= 0 && j < m) { 
 			if (matrix[i][j] == x) 
				return true;
 
			if (matrix[i][j] > x) 
				i--; 
			else 
				j++; 
		} 
 
		return false; 
	} 
} 
