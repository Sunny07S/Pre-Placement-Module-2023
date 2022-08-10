class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right=0, sum=0, min=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            if(sum<target){
                right++;
            }else{
                min=Math.min(min,right-left+1);
                sum-=nums[left];
                sum-=nums[right];
                left++;
            }
        }
        return (min==Integer.MAX_VALUE) ? 0 : min;
    }
}