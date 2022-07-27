class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
    int r = nums.length - 1;
    while(l<=r){
        
        int mid = (l+r)/2;
        if(target == nums[l]){
            return l;
        } else if (target == nums[r]){
            return r;
        } else if(target == nums[mid]){
            return mid;
        }
        else if(target > nums[mid]){
            l = mid;
            r = r - 1;
        }
        else {
            l = l + 1;
            r = mid;
        }
    }
    return -1;
        
    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms