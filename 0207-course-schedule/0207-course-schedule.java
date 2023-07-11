import java.util.ArrayList;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];

            graph[u].add(v);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && hasCycle(graph, visited, recStack, i)) {
                return false;
            }
        }

        return true;
    }

    boolean hasCycle(ArrayList<Integer>[] graph, boolean[] visited, boolean[] recStack, int curr) {
        visited[curr] = true;
        recStack[curr] = true;

        for (int neighbor : graph[curr]) {
            if (!visited[neighbor]) {
                if (hasCycle(graph, visited, recStack, neighbor)) {
                    return true;
                }
            } else if (recStack[neighbor]) {
                return true;
            }
        }

        recStack[curr] = false;
        return false;
    }

    
}
