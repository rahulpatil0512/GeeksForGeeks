// Square root of a number

class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long ans = (long)Math.sqrt(x);
		ans = (long)Math.floor(ans);
		return ans;
	 }
}
