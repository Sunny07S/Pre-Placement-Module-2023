class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, 1};
        int firstIndex = binarySearch(nums, target, true);
        int lastIndex = binarySearch(nums, target, false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }  
    public int binarySearch(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;    
        while (start <= end) {
            int mid = start + (end - start) / 2;   
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }  
        }
        return ans;
    }
}