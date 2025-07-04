package Graphs.part1;

import java.util.*;

public class BFS {
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
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    //BFS
    public static void bfs(ArrayList<Edge> graph[]){   //TC=O(V+E)
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        //the starting point can be any vertex,here we are staring from 0  
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            
            if(!vis[curr]){
                //print it
                System.out.print(curr+" ");
                //update vis
                vis[curr]=true;
                //add its neighbours into queue
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }

    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        bfs(graph);

        
    
        
    }
    
}
