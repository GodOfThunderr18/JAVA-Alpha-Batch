package Heaps.PriorityQueue;

import java.util.PriorityQueue;

public class NearByCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        int idx;

        Point(int x,int y,int dist,int idx){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p){
           return this.dist-p.dist;

        }


    }
    public static void main(String[] args) {
        int c[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<c.length;i++){
            int dist=c[i][0]*c[i][0] + c[i][1]*c[i][1];
            pq.add(new Point(c[i][0],c[i][1],dist,i));

        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
        
    }
   
}
