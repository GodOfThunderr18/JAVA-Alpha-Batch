import java.util.*;
public class JavaArrays1 {
    public static void main(String args[]){
   
     
    //input,output
       int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();

          System.out.println("phy:"+marks[0]);
          System.out.println("chem:"+marks[1]);
          System.out.println("math:"+marks[2]);
          
          int percentage=(marks[0]+marks[1]+marks[2])/3;
          System.out.println("percentage= "+percentage);
         


    //update
    /*int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();

          System.out.println("phy:"+marks[0]);
          System.out.println("chem:"+marks[1]);
          System.out.println("math:"+marks[2]);

          marks[2]=marks[2]+4;
          System.out.println("math:"+marks[2]);*/
          
          sc.close();
          
          
    //length
    /*int marks[]=new int[50];
    System.out.println("length of array="+marks.length);*/


    }
}

