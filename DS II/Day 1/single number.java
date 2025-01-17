class Solution {
    public int singleNumber(int[] nums) {
     
        int result = 0;
        for (int curr : nums) {
            result = result ^ curr;
        }
        return result;
    }
}