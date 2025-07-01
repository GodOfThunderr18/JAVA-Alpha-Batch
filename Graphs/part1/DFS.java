package Graphs.part1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFS {
    static class Edge {
        int s;
        int d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }


    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){   //TC=O(V+E)
        //print and vist curr
        System.out.print(curr+" ");
        vis[curr]=true;

        //call for its neighbpurs
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i); 
            if(!vis[e.d]){
                dfs(graph,e.d,vis);
            }
        }
    }

    //HAs Path
    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]){  //TC=O(V+E)
        if(src==dest){
            return true;
        }
        
        vis[src]=true;
        //check for its neightbours
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.d] && hasPath(graph, e.d, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        //dfs(graph, 0, new boolean[V]);

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
    
}
