class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length() > s2.length()) 
             return false;        
        int [] arr = new int[26];
        for(int i = 0; i < s1.length(); i++)
            arr[s1.charAt(i) - 'a']++;        
        int startIndex = 0;
        for(int end = 0; end < s2.length(); end++) 
        {
            while(end < s1.length() - 1) 
                arr[s2.charAt(end++) - 'a']--;
            arr[s2.charAt(end) - 'a']--;
            int i = 0;
            for(i = 0; i< 26; i++) 
                if(arr[i] != 0) 
                    break;
            if(i == 26) 
                return true;            
            arr[s2.charAt(startIndex++) - 'a']++;
        }
        return false;    
    }
}