package Graphs.part2;

import java.util.ArrayList;
import java.util.*;

public class Bipartite {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){  //for graph with 2 or more components this loop is useful
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    //check cases for its neighbours
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        //case 3
                        if(col[e.d]==-1){
                            col[e.d]=col[curr]==0?1:0; //if curr vertex color is 0 then neigh should get 1 else 0
                            //add it to queue
                            q.add(e.d);
                        }//case 1
                        else if(col[e.d]==col[curr]){
                            return false;
                        }
                        //case 2->ntg to do

                    }
                }

            }
        }
        return true;

    } 
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));  
        
    }
    
}
