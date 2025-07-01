import java.util.ArrayList;

public class ALBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //OPERATIONS

        //Add Element-TC=O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

        //Get Element-TC=O(1)  //to get an element at the given index
        int elem=list.get(2);
        System.out.println(elem);

        //remove element-O(n) //removes the elemnt at the given index
        list.remove(2);
        System.out.println(list);

        //set element at index-O(n) //replaces the element at given index with given element
        list.set(2, 10); //at index 2 which ever element is there it will be replacedd by 10
        System.out.println(list);

        //contains element-O(n) //returns true if elem is presnt in list else false
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

       //additional add func which adds an element at given index-O(n)
       list.add(1,9); //at index 1 9 gets added and rest elements are pushed right 
       System.out.println(list);


       //size of an array list
       System.out.println(list.size());
       //to print the array list
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }

    }
}
