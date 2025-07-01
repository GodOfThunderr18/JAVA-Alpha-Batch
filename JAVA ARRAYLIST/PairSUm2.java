import java.util.ArrayList;
public class PairSUm2 {
   
    public static boolean pairSum2(ArrayList<Integer> list,int targetSum){
                   //breaking point

                   int bp=-1;
                    for(int i=0;i<list.size();i++){
                        if(list.get(i)>list.get(i+1)){
                            bp=i;
                           break;
                        }
                    }
                    int lp=bp+1;
                    int rp=bp;
                    while(lp!=rp){
                        if(list.get(lp)+list.get(rp)==targetSum){
                            return true;
                        }
                        else if(list.get(lp)+list.get(rp)<targetSum){
                            lp=(lp+1)%list.size();
            
                        }else{
                            rp=(list.size()+rp-1)%list.size();
                        }
                    }
                
            return false;
    }
    public static void main(String[] args) {
         //2p0inter
         ArrayList<Integer> list=new ArrayList<>();
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         list.add(10);
         System.out.println(pairSum2(list, 16));
         
         
    }
    
}
