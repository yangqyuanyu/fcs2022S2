class Turtle extends Animal{      //child class
    public Turtle(){
        System.out.println("no-arg of Turtle is invoked");
    }
}

public class TurtleDemo{
    public static void main(String[] args){
        Turtle t=new Turtle();
        t.makesound();
    }
}
