package Graphs.part3;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        
    }

    static class Pair{
        int n;
        int dist;
        public Pair(int n,int dist){
            this.n=n;
            this.dist=dist;
        }
    }

    public static void dijk(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        boolean vis[]=new boolean[graph.length];
        dist[src]=0;
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist); //sort it wrt to dist
        pq.add(new Pair(src, dist[src]));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                //visit neigh
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.s;
                    int v=e.d;
                    int wt=e.wt;
                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }

        }
        //print all vertices shortest path from src
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        int src=0;
        dijk(graph, src);

    }
    
}
