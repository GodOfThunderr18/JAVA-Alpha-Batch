package Graphs.part1;
import java.util.*;

public class CreatingaGraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String[] args) { 

        int V=5;//no.of vertices
        //create a array of arrayList of size=no.of Vertices
        //int a[]=new int[n];
        ArrayList<Edge> graph[]=new ArrayList[V];
        //initailly the arraylist on each index have null,hence intialize them as empty
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        //0-vertex --->only 1 edge
        graph[0].add(new Edge(0, 1, 5));
        
        //1-vertex
        graph[1].add(new Edge(1,0, 5));
        graph[1].add(new Edge(1,2, 1));
        graph[1].add(new Edge(1,3, 3));

        //2-vertex
        graph[2].add(new Edge(2,1, 1));
        graph[2].add(new Edge(2,3, 1));
        graph[2].add(new Edge(2,4, 2));

        //3-vertex
        graph[3].add(new Edge(3,1, 3));
        graph[3].add(new Edge(3,2, 1));

        //4-vertex
        graph[4].add(new Edge(4,2, 2));


        //to get vertex 2 neighbours
        for(int i=0;i<graph[2].size();i++){  //travel throghr the AL presnt at idx 2 of graph
            Edge e=graph[2].get(i); 
            System.out.println("neighbouring vertex:"+e.dest+" connecting edgde weight:"+e.wt);
            
        }
    }
    
}
