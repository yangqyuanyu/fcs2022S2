class Triangle extends Shape{
    public Triangle(){
        super();                  //to invoke parent's constructor
        System.out.println("As well as that of subclass !");
    }

    void area(){
        System.out.println("Secondly, let's calculate the area of triangle!");
    }

    void printMsg(){
        super.area();          //call the overriden method
        area();                //call the overriding method
    }

}


public class TriangleDemo{
    public static void main(String[] args){
        Triangle t=new Triangle();
        t.printMsg();
    }
}