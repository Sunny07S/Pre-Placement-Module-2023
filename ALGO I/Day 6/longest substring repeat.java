class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2)
            return s.length();
        int i = 0;
        int j = 1;
        int max = Integer.MIN_VALUE;
        while(j < s.length() && i < s.length())
        {
			if(s.substring(i, j).contains(s.charAt(j) + ""))
				i++;
            else
            {
				j++;
				if(j-i > max)
					max = j-i;
            }
        }
        return Math.max(max, 1);   
    }
}