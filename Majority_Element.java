class Solution
{
    static int findCandidate(int a[], int size) 
    { 
        int maj_index = 0, count = 1; 
        for (int i = 1; i < size; i++) 
        { 
            if (a[maj_index] == a[i]) 
                count++; 
            else
                count--; 
            if (count == 0) 
            { 
                maj_index = i; 
                count = 1; 
            } 
        } 
        return a[maj_index]; 
    }
    static boolean isMajority(int a[], int size, int cand) 
    { 
        int count = 0; 
        for (int i = 0; i < size; i++) 
            if (a[i] == cand) 
                count++; 
            if (count > size/2) 
                return true; 
            else
                return false; 
    }
    static int majorityElement(int a[], int size)
    {
        int cand = findCandidate(a, size); 
        if (isMajority(a, size, cand) == true) 
            return cand;
        else
            return -1;
    }
}
