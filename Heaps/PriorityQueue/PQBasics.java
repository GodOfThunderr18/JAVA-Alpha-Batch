package Heaps.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQBasics {
    // public static void main(String[] args) {
    //     PriorityQueue<Integer> pq=new PriorityQueue<>();
    //     pq.add(3);
    //     pq.add(4);
    //     pq.add(1);
    //     pq.add(7);
    //     while(!pq.isEmpty()){
    //         System.out.print(pq.peek()+" ");
    //         pq.remove(); 
    //     }
    //     System.out.println();
    //     PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
    //     pq2.add(3);
    //     pq2.add(4);
    //     pq2.add(1);
    //     pq2.add(7);
    //     while(!pq2.isEmpty()){
    //         System.out.print(pq2.peek()+" ");
    //         pq2.remove(); 
    //     }
        
    // }


    //PQ for objects
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank; //according to rank we are comparing two objects
        }   //curent object is being compared to s2 object 


    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 1));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
     
    
}
