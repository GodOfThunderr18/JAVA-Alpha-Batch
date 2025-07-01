package Graphs.part5.PQ;

import java.util.*;

class MotherVertex {
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean vis[]) {
        vis[curr] = true;
        for (int n : adj.get(curr)) {
            if (!vis[n]) {
                dfs(adj, n, vis);
            }
        }
    }

    // Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        int mother = -1;

        // Step 1: Find a candidate mother vertex
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(adj, i, vis);
                mother = i; // Last finished vertex in DFS is a candidate
            }
        }

        // Step 2: Check if the candidate mother vertex is valid
        Arrays.fill(vis, false);
        dfs(adj, mother, vis);

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                return -1; // If any vertex is not visited, no mother vertex exists
            }
        }

        return mother; //if all vertex are visited then we have a mother
    }
}

