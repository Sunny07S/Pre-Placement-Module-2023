class Solution {
    static void DFS(int[][] network, int city, boolean[] visited) {
        visited[city] = true;
        for(int j = 0; j < network.length; j++) {
            if(visited[j] == false && network[city][j] == 1)
                DFS(network, j, visited);
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;
        for(int i = 0; i < isConnected.length; i++) {
            if(visited[i] == false){
                DFS(isConnected, i, visited);
                provinces++;
            }
        }
        return provinces;
    }
}