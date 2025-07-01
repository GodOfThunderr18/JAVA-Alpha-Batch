package Graphs.part2;

import java.util.ArrayList;

public class DGraphCycle {
    static class Edge{
        int s;
        int d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;

        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 2));
        

        graph[1].add(new Edge(1, 0));
        
        graph[2].add(new Edge(2, 3));
        

        graph[3].add(new Edge(3, 0));

        
    }
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    

    public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.d] && stack[e.d]){
                return true;
            }
            if(!vis[e.d] && isCycleUtil(graph, e.d, vis, stack)){
                return true;
            }
            //if neigh is vis and stack[neigh] is false then ntg to do
        }
        //this step should be reached when a vertex has no neigh left and all the neigh returned false
        stack[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
         
    }
    
}
