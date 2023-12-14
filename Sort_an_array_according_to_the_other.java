// Sort an array according to the other

class Solution{
     public static int[] sortA1ByA2(int A1[],int N,int A2[], int M)
    {
       TreeMap<Integer,Integer> map=new TreeMap<>();
       
         for( int l=0;l<N;l++)
        if(!map.containsKey(A1[l]))
            map.put(A1[l],1);
        else
            map.put(A1[l],map.get(A1[l])+1);
        
        int i=0;
        
        for( int l=0;l<M;l++)
        {
            if(map.containsKey(A2[l]))
            { 
               for( int k=0;k<map.get(A2[l]);k++)
                A1[i++]=(A2[l]);
                map.remove(A2[l]);
            }
        }
        
         for(Entry<Integer,Integer> nag : map.entrySet())
        {
              for(int p=0;p<nag.getValue();p++)
            A1[i++]=nag.getKey();
        }
        
         return A1;
    }
}
