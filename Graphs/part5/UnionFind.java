package Graphs.part5;

public class UnionFind {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];
    //func to intialize par and rank
    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
            rank[i]=0;
        }
    }

    //find
    public static int find(int x){
        // we need supreme leader of x
        if(x==par[x]){
            return x;
        }
        //else rec call 
        return par[x]=find(par[x]); //optimized version-Path compression optimization
    }

    //union
    public static void union(int a,int b){
        //first get both their parents to compare their ranks and join them
        int parA=find(a);
        int parB=find(b);
        if(rank[parA]==rank[parB]){ //anyone can be the parent 
            //by def lets make a as par of b
            par[parB]=parA;
            //update parA rank
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else{
            par[parB]=parA;
        }

    }
    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        System.out.println(find(4));//2 is par of 4 rn
        union(3, 6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
    }
    
}
