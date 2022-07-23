class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> chars = new HashMap();
        
        for (Character ch : s.toCharArray()) {
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }
                
        for (Character ch : t.toCharArray()) {
            chars.put(ch, chars.getOrDefault(ch, 0) -1);
        }
        
        for (int num : chars.values()) {
            if (num != 0) {
                return false;
            }
        }
        
        return true;
    }
}