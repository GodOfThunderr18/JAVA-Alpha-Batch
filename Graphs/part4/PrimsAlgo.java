package Graphs.part4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
    static class Edge{
        int s;
        int d;
        int wt;
        Edge(int s,int d,int wt){
            this.s=s;
            this.d=d;
            this.wt=wt;
        }
        

    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair{
        int v;
        int cost;
        Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        } 
    }

    public static void prim(ArrayList<Edge> graph[]){
        int MSTcost=0;
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                MSTcost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.d,e.wt));
                }
            }
        }
        System.out.println(MSTcost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        prim(graph);

    }
    
}
