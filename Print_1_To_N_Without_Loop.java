// Print 1 To N Without Loop

class Solution
{
    public void printNos(int N)
    {
        if(N > 0) 
        {
            printNos(N-1); 
            System.out.print(N+" "); 
        }
        return;
    }
}
