package Graphs.part2;

import java.util.ArrayList;

public class CycleUDGraph {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 2));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){ //if two or more components presnt then its useful
                if(detectCycleUtil(graph,vis,i,-1)){  //if at any vertex cycleDetetction is returnrd as true then return true
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int parent){
        //first make curr as visited
        vis[curr]=true;
        //now detetct if cycle exists with the help of this curr vertex neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!vis[e.d]){
                //check if cycle exists for this neighbour,if exists then return true
                if(detectCycleUtil(graph, vis, e.d, curr)){//the neigh is our curr now and our prev curr is parent of this neigh obviously
                    return true;
                }
            }
            //case 1
            else if(vis[e.d] && e.d!=parent){
                return true;
            }
            //case 2-->nothing to do
        }
       //if none gives true then false
       return false;
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
         
    }
    
}
