// Print N to 1 without loop

class Solution {
    void printNos(int N){
        if (N <= 0) {
            return; 
        } 
        else {
            System.out.print(N + " "); // print N
            printNos(N - 1);
        }
    }
}
