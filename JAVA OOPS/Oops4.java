//COPY CONSTRUCTOR

public class Oops4{
    public static void main(String[] args) {
        Stdent s1=new Stdent();
        s1.name="Sush";
        s1.rollno=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Stdent s2=new Stdent(s1); // copy
        s2.password="xyz";
        System.out.println(s2.name);
        s1.marks[2]=100; //for shallow copy constructor:we changed the s1 marks after copying s1 into s2 so it shouldnt change in s2 but even in s2 it will change as marks ARRAY copys the refernces of thr array in the memory but not the elements.
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
 }
    class Stdent{
        String name;
        int rollno;
        String password;
        int marks[];

        Stdent(){
            marks=new int[3];
            System.out.println("Hi");
        }
       //shallow copy constructor
        /*Stdent(Stdent s1){
            marks=new int[3];
            this.name=s1.name;
            this.rollno=s1.rollno;
            this.marks=s1.marks;*/
        

        //ddeep copy constructor
        Stdent (Stdent s1){
            this.name=s1.name; 
            marks=new int[3];
            for(int i=0;i<marks.length;i++){  //creating a new marks array and stroing the values of s1 array and not the refrences. 
                this.marks[i]=s1.marks[i];
            }


        }

    }