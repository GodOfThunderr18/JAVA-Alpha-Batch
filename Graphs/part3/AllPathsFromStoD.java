package Graphs.part3;

import java.util.ArrayList;

public class AllPathsFromStoD {
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

        graph[0].add(new Edge(0, 3));
        
        graph[2].add(new Edge(2, 3));
        

        graph[3].add(new Edge(3, 1));
        
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        
    }

    public static void allPaths(ArrayList<Edge> graph[],int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            allPaths(graph, e.d, dest, path+src); 
        }
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        allPaths(graph, 5, 1, "");
        //you migth get a doubt that for each backtracking step we should remove last char from path,but note that path is a string and strings are immutable i.e at each call the path is newly created ,if u use sb then u have to delete last char form path at each backtracking step 
        
    }

    

    
}
