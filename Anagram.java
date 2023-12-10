// Anagram

class Solution
{
     public static boolean isAnagram(String s1,String s2)
    {
        int h1[]=new int[26];
        int h2[]=new int[26];
        Arrays.fill(h1,0);
        int i;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        for(i=0;i<s1.length();i++)
        {
            h1[s1.charAt(i)-'a']++;
        }
        for(i=0;i<s2.length();i++)
        {
            h1[s2.charAt(i)-'a']--;
        }
 
        for(i=0;i<26;i++)
        {
            if(h1[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
