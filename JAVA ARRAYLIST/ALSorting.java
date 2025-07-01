import java.util.*;
public class ALSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());  //this Collections.reverseprder() is a Comparator--its a function which defines sorting logic
        System.out.println(list);
    }
}
