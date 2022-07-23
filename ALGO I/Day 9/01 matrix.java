class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] dir = new int[]{0, 1, 0, -1, 0};
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0) q.offer(new int[]{i, j});
                else mat[i][j] = -1;
            }
        }
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for(int i = 0; i < 4; i++){
                int nr = r + dir[i];
                int nc = c + dir[i + 1];
                if((nr >= 0 && nr < m) && (nc >= 0 && nc < n) && mat[nr][nc] == -1){
                    mat[nr][nc] = mat[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return mat;
    }
}