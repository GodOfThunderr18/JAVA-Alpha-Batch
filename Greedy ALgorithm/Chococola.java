import java.util.Arrays;
import java.util.Collections;

public class Chococola {
    public static void main(String[] args) {
        Integer horzCost[]={4,1,2};
        Integer vertCost[]={2,1,3,1,4};
        Arrays.sort(horzCost,Collections.reverseOrder());
        Arrays.sort(vertCost,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while (h<horzCost.length && v<vertCost.length) {
            //vertical cut
            if(vertCost[v]>=horzCost[h]){
                cost+=(vertCost[v]*hp);
                vp++; //after each vertical cut no of vp increase by 1 
                v++;
            }else{ //horzcut
                cost+=(horzCost[h]*vp);
                hp++;
                h++;
            }
            
        }
        //leftover elements
        while(v<vertCost.length){
            cost+=(vertCost[v]*hp);
                vp++;
                v++;

        }
        while(h<horzCost.length){
            cost+=(horzCost[h]*vp);
                hp++;
                h++;

        }
        System.out.println("Min cost: "+cost);

    }
    
}
