//TOTAL ABSTRACTION
public class Oops8 {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Elephant e=new Elephant();
        e.moves();
    }
    
}

interface ChessPlayer{
    void moves();  //by default its public,abstract 
}

class Queen implements ChessPlayer{
     public void moves(){    //if u dont declare as public it gives error as in interface its a public method so u hvae to use public here else it will be under default access modifier
        System.out.println("top,down,right,left,diagnol");
    }
}

class Elephant implements ChessPlayer{
    public void moves(){    
       System.out.println("top,down,right,left");
   }
}


//MULTI LEVEL INTERFACE

// public class Oops8 {
//     public static void main(String[] args) {
//         Bear b=new Bear();
//         b.meat();
//         b.grass();

//     }
// }

// interface carnivore{
//     void meat();
// }

// interface herbivore{
//     void grass();
// }

// class Bear implements carnivore,herbivore{
//     public void meat(){
//         System.out.println("eats meat");
//     }
//     public void grass(){
//         System.out.println("Eats grass too");
//     }
// }
