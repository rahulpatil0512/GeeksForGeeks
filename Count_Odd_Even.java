// Count Odd Even

class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int countOdd = 0 ;
        int countEven =  0 ;
        for(int i : arr){
           if(i%2 == 0 ){
               countEven++;
           }
           else{
               countOdd++;
           }
       }
       System.out.println(countOdd+" "+countEven);
        
    }
}
