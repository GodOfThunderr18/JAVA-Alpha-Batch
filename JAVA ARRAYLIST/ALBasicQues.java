import java.util.ArrayList;

public class ALBasicQues {

    //function for swapping
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
            int temp=list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        //Reverse of an array list
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //Maximum number in arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max, list.get(i));
        }
        System.out.print("Maximum element is= "+max);
        System.out.println();


        //Swap two numbers
        
        System.out.println("Before Swapping="+list);
        swap(list, 1, 3);
        System.out.println("After swapping="+list);






    }
    
}
