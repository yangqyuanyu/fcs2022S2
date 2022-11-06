class Circle extends Shape{
    public Circle(){
        super();                  //to invoke parent's constructor
        System.out.println("As well as that of subclass !");
    }

    void area(){
        System.out.println("Secondly, let's calculate the area of circle!");
    }

    void printMsg(){
        super.area();          //call the overriden method
        area();                //call the overriding method
    }

}


public class CircleDemo{
    public static void main(String[] args){
        Circle c=new Circle();
        c.printMsg();
    }
}
