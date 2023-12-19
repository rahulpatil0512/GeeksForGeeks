// Left most and right most index

class Solution{
    int lower_bound(long A[],int L,int R,long K){
        int pos=R+1;
         while(L<=R){
            int M = (L+R)/2;
            if(A[M]>=K){
                pos=M;
                R=M-1;
            }
            else{
              L=M+1;   
            }  
        }
        return pos;  
    }
    int upper_bound(long A[],int L,int R,long K){
        int pos=-1;
        while(L<=R){
            int M = (L+R)/2;
             if(A[M]<=K){
                pos=M;
                L=M+1;
            }
            else{
              R=M-1;  
            }   
        }
        return pos;  
    }
    public pair indexes(long v[], long x)
    {
        int lb = lower_bound(v,0,v.length-1, x);
        int ub = upper_bound(v,0,v.length-1, x);
        if(lb == v.length || v[lb]!=x){
            return new pair(-1,-1);
        } 
        return new pair(lb,ub);
    } 
}
