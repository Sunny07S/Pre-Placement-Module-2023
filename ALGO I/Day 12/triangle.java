class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size+1][size+1];
        for(int[] d: dp){
            Arrays.fill(d, -1);
        }
        return solve(0, 0, size, triangle, dp);
    }
    public int solve(int i, int j, int size, List<List<Integer>> triangle, int[][] dp){
        if(i==size-1)
            return triangle.get(i).get(j);
        if(dp[i][j] != -1)
            return dp[i][j];
        int down = triangle.get(i).get(j) + solve(i+1, j, size, triangle, dp);
        int dRight = triangle.get(i).get(j) + solve(i+1, j+1, size, triangle, dp);
        
        return dp[i][j] = Math.min(down, dRight);
    }
}