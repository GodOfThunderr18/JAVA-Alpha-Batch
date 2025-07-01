import java.util.ArrayList;
import java.util.Collections;

 public class ALPQs {
    public static boolean mon(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return inc || dec;
    }
     
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(mon(list));
    }

    /*public static ArrayList<Integer> lonely(ArrayList<Integer> list){
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(Collections.frequency(list,list.get(i))==1&&(list.contains(list.get(i)+1)==false&&list.contains(list.get(i)-1)==false)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        System.err.println(lonely(list));
    
    }*/


    /*public static int TargetMax(ArrayList<Integer> list,int key){
        int maxTargetcount=Integer.MIN_VALUE;
         int result[]=new int[1000];
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
                result[list.get(i+1)-1 ]++;
            }
         }
         int ans=0;
         for(int i=0;i<1000;i++){
            if(result[i]>maxTargetcount){
                maxTargetcount=result[i];
                ans=i+1;
            }
         }
         return ans;

        


    }
        
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(TargetMax(list, 1));

          
    }*/
    
}


