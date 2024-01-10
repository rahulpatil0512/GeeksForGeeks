// Largest Number formed from an Array

class Solution {
    String printLargest(String[] arr) {
        Arrays.sort(arr,new Comparator<String>(){
            @Override 
            public int compare(String x, String y){
                String xy = x+y;   
                String yx = y+x;   
                return yx.compareTo(xy);   
            }
        });
        String ans = "";
        for(int i=0; i<arr.length; i++){
            ans += arr[i];
        }
        return ans; 
    }
}
