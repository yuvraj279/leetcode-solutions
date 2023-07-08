class Solution {
    Integer count=0;
    public int makeConnected(int n, int[][] connections) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:connections){
            int u=edge[0];
            int v=edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(graph);
        if (connections.length < n - 1) {
            return -1;
        }
        return count - 1;
    }
    void dfs(ArrayList<Integer>[] graph){
        boolean[] vis=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                dfsutil(graph,vis,i);
                count+=1;
            }
        }
    }
    void dfsutil(ArrayList<Integer>[] graph, boolean[] vis, int vertex) {
        vis[vertex]=true;
        for (int i = 0; i <graph[vertex].size() ; i++) {
            int e=graph[vertex].get(i);
            if (!vis[e]){
                dfsutil(graph,vis,e);
            }
        }
    }

}