/* public class Oops5 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();  //this function is passed from the base class
        shark.swim();
        shark.color="blue"; //this property is passed from base class
        System.out.println(shark.color);
        
    }
    
}
//Single Level Inheritance  
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("It swims");
    }
}*/



//Multi level Inheritance
/*public class Oops5{
    public static void main(String[] args) {
        Dog simbha=new Dog();
        simbha.eat();
        simbha.legs=4;
        System.out.println(simbha.legs);   //in oops6 also same class hence output wont come until u comment out that class
        simbha.breed="Lab";
        System.out.println(simbha.breed);
         
        
    }
}


class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    int legs;

}

class Dog extends Mammals{
    String breed;
}*/



//Hierarchial Inheritance

// class Oops5{
//     public static void main(String[] args) {
//         Fish f=new Fish();
//         f.eat();
//         f.swim();
//         Bird b=new Bird();
//         b.eat();
//         b.fly();
        
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }


// class Fish extends Animal{
//     void swim(){
//         System.out.println("It swims");
//     }
// }


// class Mammals extends Animal{
//     void walk(){
//         System.out.println("It walks");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("It flys");
//     }
// }



 