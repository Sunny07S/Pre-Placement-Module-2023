class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0, nums, ans);
        return ans;
    }
    
    private void swap(int i, int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void permutations(int index, int []nums, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = index; i < nums.length; i++){
            swap(i, index, nums);
            permutations(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
}