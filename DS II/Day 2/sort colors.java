class Solution {
   public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        BubbleSort(nums,0,end);
    }
    private void BubbleSort(int [] arr,int start,int end) {
		boolean swapped = false;
		if(end <= start) {
			return;
		}
		for(int i=0;i<=end-1;i++) {
			if(arr[i]>arr[i+1]) {
				swap(arr,i,i+1);
				swapped = true;
			}
		}
		if(!swapped) {
			return;
		}
		BubbleSort(arr,start,end-1);
	}
    
   private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
        
    
}