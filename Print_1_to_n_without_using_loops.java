// Print 1 to n without using loops

class Solution{
    static void printTillN(int N){
        if(N==0){
            return;
        }
        printTillN(N-1);
        System.out.print(N + " ");
    }
}
