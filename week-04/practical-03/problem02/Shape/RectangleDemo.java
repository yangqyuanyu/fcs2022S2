class Rectangle extends Shape{
    public Rectangle(){
        super();                  //to invoke parent's constructor
        System.out.println("As well as that of subclass !");
    }

    void area(){
        System.out.println("Secondly, let's calculate the area of rectangle!");
    }

    void printMsg(){
        super.area();          //call the overriden method
        area();                //call the overriding method
    }

}


public class RectangleDemo{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.printMsg();
    }
}