public class Oops3{
    public static void main(String[] args) {
        //Studentt s1=new Studentt();
        Studentt s2=new Studentt("Sushanth");   //This is known as Constructor Overloading     --->This is an example of Polymorphism(multiple forms)
        Studentt s3=new Studentt(19); 

        System.out.println(s2.name);
        System.out.println(s3.age);
    }
}
  

class Studentt{
    String name;
    int age;

    Studentt(){  //This is a non parametrized constructor
        System.out.println("Constructor is called");
        }

    Studentt(String name){   //THis is a parametrized constructor
        this.name=name;
        }

    Studentt(int age){
        this.age=age;
    }
}