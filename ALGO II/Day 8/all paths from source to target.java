class Solution {
    int target;
    List<List<Integer>> ll=new ArrayList<List<Integer>>();
    
    void dfs(int node, List l, int[][] graph){
        if(node==target){
            List<Integer> newList=new ArrayList<>(l);
            newList.add(node);
            ll.add(newList);
            return;
        }
        for(int i=0;i<graph[node].length;i++){
            List<Integer> newList=new ArrayList<>(l);
            newList.add(node);
            dfs(graph[node][i],newList,graph);
        }
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        target=graph.length-1;
        for(int i=0;i<graph[0].length;i++)
            dfs(graph[0][i],Arrays.asList(0),graph);
        return ll;
    }
}