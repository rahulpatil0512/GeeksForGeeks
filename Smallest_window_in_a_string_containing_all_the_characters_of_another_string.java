// Smallest window in a string containing all the characters of another string

class Solution{
    public static String smallestWindow(String s, String p){
        int len1 = s.length();
	    int len2 = p.length();
	    if(len1 < len2){
	        return "-1";
	    }

	    int[] hash_pat = new int[256];
	    int[] hash_str = new int[256];

	    for(int i = 0; i < len2; i++){
	        hash_pat[p.charAt(i)]++;
	    }
	    
	    int start = 0;
	    int start_index = -1;
	    int min_len = Integer.MAX_VALUE;
	    int count = 0;
	    for(int j = 0; j < len1; j++){
	        hash_str[s.charAt(j)]++;
	        if(hash_pat[s.charAt(j)] != 0 
	        &&hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)])
	        {
	            count++;
	        }

	        if(count == len2){
	            while(hash_str[s.charAt(start)]>hash_pat[s.charAt(start)] ||
                hash_pat[s.charAt(start)] == 0)
                {
                    if(hash_str[s.charAt(start)]>hash_pat[s.charAt(start)]){
                        hash_str[s.charAt(start)]--;
                    }
                    start++;
                }
                int len_window = j - start + 1;
                if(min_len > len_window){
                    min_len = len_window;
                    start_index = start;
                }
	        }
	        
	    }
	    
	    if(start_index == -1){
	        return("-1");
	    } 
	    else{
	        return(s.substring(start_index, start_index + min_len));
	    }
    }
}
