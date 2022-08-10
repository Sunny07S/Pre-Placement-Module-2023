class Solution {
    
    // Recursion and Backtracking
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,new ArrayList<Integer>(),ans);
        return ans;
    }
    public void helper(int[] nums,int i,List<Integer> sub,List<List<Integer>> ans){
        
        ans.add(new ArrayList(sub));
        for(int j=i;j<nums.length;j++){
            sub.add(nums[j]);
            helper(nums,j+1,sub,ans);
            sub.remove(sub.size()-1);
        }
    }
}
    
   