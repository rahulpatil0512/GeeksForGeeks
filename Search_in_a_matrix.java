// Search in a matrix

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        int r = 0;
        int c = M-1;
        
        while(r<N && c>=0){
            if(mat[r][c]==X){
                return 1;
            }
            else if(mat[r][c]<X){
                r++;
            }
            else{
                c--;
            }
        }
        return 0;
    }
}
