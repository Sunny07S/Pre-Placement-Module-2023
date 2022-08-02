class Solution {
    public boolean bs(int nums[], int t, int l, int h){
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]==t) return true;
            else if(nums[mid]>t) h = mid-1;
            else l = mid+1;
        }
        return nums[l]==t?true:false;
    }
    public boolean searchMatrix(int[][] m, int t) {
        for(int i=0;i<m.length;i++){
            if(t>=m[i][0]&&t<=m[i][m[0].length-1]){
                return bs(m[i],t, 0, m[0].length-1);
            }
        }
        return false;
    }
}