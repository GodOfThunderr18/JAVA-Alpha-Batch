import java.util.ArrayList;
public class Pairsum1 {
    //Brute FOrce
    /*public static boolean pairSum1(ArrayList<Integer> list,int targerSum){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==targerSum){
                    return true;
                }
            }
        }
        return false;
    }*/

    //2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> list,int targetSum){
          int lp=0;
          int rp=list.size()-1;
          while(lp<rp){
            if(list.get(lp)+list.get(rp)==targetSum){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<targetSum){
                lp++;

            }else{
                rp--;
            }
          }
          return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum1(list, 5));
        

    }
}
