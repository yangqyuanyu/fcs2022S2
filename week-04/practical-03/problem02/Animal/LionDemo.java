class Lion extends Animal{       //child class
    public Lion(){
        System.out.println("no-arg of Lion is invoked");
    }
}

public class LionDemo{
    public static void main(String[] args){
        Lion l=new Lion();
        l.makesound();
    }
}