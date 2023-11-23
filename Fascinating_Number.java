// Fascinating Number

class Solution{
    //determines if a number is fascinating
    boolean fascinating(long n) {
        //calculating the multiples of n
        long x = 2 * n;
        long y = 3 * n;
        
        //converting the multiples to strings
        String s =  Long.toString(x);
        String ss = Long.toString(y);
        String q = Long.toString(n);
        
        //concatenating the strings
        q = q+s;
        q = q+ss;
        
        //initializing an array to store the frequency of digits
        int [] hash = new int[10];
        
        //counting the frequency of each digit in the concatenated string
        for(int i = 0; i < q.length(); i++){
            hash[q.charAt(i) - '0']++;
        }
        
        //checking if each digit appears only once in the concatenated string
        for (int i = 1; i <= 9; i++) {
	        if (hash[i] != 1) {
	            //returning false if any digit appears more than once
	            return false;
	        }
	    }
	    
	    //returning true if each digit appears only once in the concatenated string
	    return true;
    }
}
