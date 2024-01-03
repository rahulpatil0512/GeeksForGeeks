// Count Smaller elements

class Solution {
    int bit[];
    int[] constructLowerArray(int[] a, int n) {
        pair p[]=new pair[n];
        for(int i=0;i<n;i++){
            p[i]=new pair(a[i],i);
        }
        Arrays.sort(p,(p1,p2)->p1.a-p2.a);
        int in=1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(p[i].a)){
                hm.put(p[i].a,in++);   
            }
        }
        for(int i=0;i<n;i++){
            a[i]=hm.get(a[i]);
        }
        bit=new int[(int)1e6+1];
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=get(a[i]-1);
            update(a[i],1);
        }
        return ans;
    }
    void update(int i,int p)
    {
        for(;i<(int)1e6+1;i+=i&(-1*i)){
            bit[i]+=p;
        }
    }
    int get(int i)
    {
        int ans=0;
        for(;i>0;i-=i&(-1*i)){
            ans+=bit[i];
        }
        return ans;
    }
    class pair
    {
        int a,b;
        public pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
}
