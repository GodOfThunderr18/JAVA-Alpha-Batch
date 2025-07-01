public class Oops6 {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
        
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("Eats grass");
    }

}
