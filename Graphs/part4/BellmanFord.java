package Graphs.part4;

import java.util.ArrayList;

public class BellmanFord { 
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
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFOrd(ArrayList<Edge> graph[],int source){
        int dist[]=new int[graph.length];
        dist[source]=0;  
        for(int i=0;i<dist.length;i++){
            if(i!=source){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        //O(V*E)
        int V=graph.length; //no.of vertices
        for(int i=0;i<V-1;i++){ //O(V)
            //we have perform relaxation for all edges
            for(int j=0;j<graph.length;j++){ //go to all vertices and get edges //dont confuse that it takes O(n3) TC its still O(E)
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    //relaxation step
                    int u=e.s;
                    int v=e.d;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }

            }
        }
        //print
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

         
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        bellmanFOrd(graph, 0); 
    }
    
}
