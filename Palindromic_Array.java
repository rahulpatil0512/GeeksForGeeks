// Palindromic Array

class GfG
{
	public static int palinArray(int[] a, int n){
                  //add code here.
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum = (sum * 10) + rem;
                num = num / 10;
            }
            if (a[i] != sum) {
                return 0;
            }
        }
	    return 1;
    }
}
