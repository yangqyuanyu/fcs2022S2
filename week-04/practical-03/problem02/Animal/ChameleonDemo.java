class Chameleon extends Animal{                  //child class
    public Chameleon(){
        System.out.println("no-arg of Chameleon is invoked");
    }
}

public class ChameleonDemo{
    public static void main(String[] args){
        Chameleon c=new Chameleon();
        c.makesound();
    }
}
