class PhysicalBook extends Book{
    public PhysicalBook(String url){
        super();                        //invoke parent constructor of no-arg
        System.out.println("parameterized constructor of PhysicalBook is invoked");
    }
}


public class PhysicalBookDemo{
    public static void main(String[] args){
        new PhysicalBook("maoxiaotong");             //invoke the constructor above
    }
}