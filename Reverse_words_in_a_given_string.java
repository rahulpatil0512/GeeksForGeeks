// Reverse words in a given string

class Solution {
    String reverseWords(String s){
        String words[] = s.split("\\.");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--){
            result += words[i];
            if(i!=0){
                result += '.';
            }
        }
        return result;
    }
}
