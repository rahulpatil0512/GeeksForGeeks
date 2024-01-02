// Merge k Sorted Arrays

class Solution{
    public static class HeapItem implements Comparable<HeapItem>{
        int[] array;                
        int index;        
        public HeapItem(int[] arr, int index) {
           array = arr;
           this.index=index;
        }   
        @Override
        public int compareTo(HeapItem h){
            if(array[index] > h.array[h.index]){
                return 1;
            }
            else if(array[index] < h.array[h.index]){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) {
        PriorityQueue<HeapItem> pq = new PriorityQueue<HeapItem>();             
        for (int i = 0; i < arrays.length; i++) {
            pq.add(new HeapItem(arrays[i], 0));
        }
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        while (!pq.isEmpty()){
            HeapItem current = pq.remove();
            result.add(current.array[current.index]);                       
            if (current.index < current.array.length-1) {  
        	    current.index++;
        	    pq.add(current); 
            }
        }
        return result;
    } 
}
