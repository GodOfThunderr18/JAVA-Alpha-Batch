//class name should stRt with capital letters and function name should be small letters

public class Oops {
    public static void main(String[] args) {  //this main function should be done after doing the objects below the main function. 
        Pen p1=new Pen();   //created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setcolor("Yellow");
        p1.color="yellow";  
        System.out.println(p1.color);  

        Student s=new Student();  //created a student object named s
         s.name="Sushanth";
         s.age=19;
         s.calcPercentage(80, 90, 100);
         System.out.println(s.name);
         System.out.println(s.age);
        System.out.println(s.percentage);
       

    }
    
}

class Pen{
    String color;
    int tip;

    void setcolor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;

          

    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;  
    }
}
