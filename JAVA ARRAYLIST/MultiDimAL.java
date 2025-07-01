import java.util.ArrayList;
public class MultiDimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        //ArrayList<ArrayList> mainList=new ArrayList<>();  this will also work
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainList.add(list1);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        mainList.add(list2);

        System.out.println(mainList);
         
        //to get amy particular list from the main liist
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);  //since we are accesing a list hence the variable used is arraylist
            System.out.println(currList);
            for(int j=0;j<currList.size();j++){ //for accesing curr list elements
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        


    }
}
