class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res= new ArrayList<List<Integer>>();
        if(nums.length==0){
            return res;
        }
       
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
    
            int start=i+1;
            int back= n-1;
            
            while(start<back){
                if(nums[start]+nums[back]+nums[i]>0){
                    back--;   
                }else if(nums[start]+nums[back]+nums[i]<0){
                    start++;
                }else{
                    ArrayList<Integer> triad = new ArrayList<>();
                    triad.add(nums[i]);
                    triad.add(nums[start]);
                    triad.add(nums[back]);
                    res.add(triad);
					
					// for skipping same values at start so that we get unique triads or triplets
                     while(start < back && nums[start]==triad.get(1)) start++;
					 
					 // for skipping same values at back
                     while(start < back && nums[back]==triad.get(2))  back--;
                }
                   
            }
			
			//for skipping same values present at ith index
            while(i+1 < n && nums[i+1]==nums[i] ) i++;
        }
        return res;
    }
}