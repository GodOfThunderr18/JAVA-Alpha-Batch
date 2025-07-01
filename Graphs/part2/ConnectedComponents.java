package Graphs.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    static class Edge {
        int s, d;
        Edge(int s, int d) {
            this.s = s;
            this.d = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
        graph[6].add(new Edge(6, 7));

        graph[7].add(new Edge(7, 6));
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) { //this condition is important if two or more components are ppresnt
                bfsUtil(graph, i, vis);
                System.out.println(); // Separate components
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[], int start, boolean vis[]) { // TC = O(V + E)
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (Edge e : graph[curr]) {
                    if (!vis[e.d]) {
                        q.add(e.d);
                    }
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
                System.out.println(); // Separate components
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) { // TC = O(V + E)
        vis[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!vis[e.d]) {
                dfsUtil(graph, e.d, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 8;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("BFS Traversal:");
        bfs(graph);

        System.out.println("\nDFS Traversal:");
        dfs(graph);
    }
}
