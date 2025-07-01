public class Oops7 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.walk();
        //d.changeColor();
        System.out.println(d.color);

        Hen h=new Hen();
        h.eat();
        h.walk();
        
    }
}

abstract class Animal{
    String color;
     Animal(){
        color="brown";
     }



    void eat(){
        System.out.println("Eats anything");
    }

    abstract void walk();  //abstract method
}

class Dog extends Animal{
    void changeColor(){
        color="black";

    }
    void walk(){
        System.out.println("Walks on 4legs");
    }

}

class Hen extends Animal{
    void walk(){
        System.out.println("Walks on 2legs");
    }
    
}
