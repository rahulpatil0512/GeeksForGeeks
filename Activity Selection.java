// Activity Selection

class pair 
{
  int first, second;
  public pair(int start, int finish)
  {
    this.first = start;
    this.second = finish;
  }
}
class Solution 
{
    public static int activitySelection(int start[], int end[], int n)
    {
        pair [] x = new pair[n];
        for(int i = 0; i < n; i++){
            x[i]  = new pair(start[i],end[i]);
        }
        Arrays.sort(x,new Comparator<pair>() {
                @Override
                public int compare(pair s1, pair s2)
                {
                    return s1.second - s2.second;
                }
        });
        int last = 0;
        int res = 0;
        for (int i = 0; i < n; i++) 
        {
            if (x[i].first > last) 
            {
                res++;
                last = x[i].second;
            }
        }
        return res;
    }
}
