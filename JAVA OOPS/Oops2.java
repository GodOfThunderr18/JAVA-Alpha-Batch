//Getters and Setters

public class Oops2 {
    public static void main(String[] args) {
        Pens p1=new Pens();   //created a pens object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
        
    }
    
}


class Pens{
    private String color;
    private int tip;
     
    String getColor(){   
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
          tip=newTip;  

          

    }
}
