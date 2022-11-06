class EBook extends Book{
    public EBook(String url){
        super();                        //invoke parent constructor of no-arg
        System.out.println("parameterized constructor of EBook is invoked");
    }
}

public class EBookDemo{
    public static void main(String[] args){
        new EBook("kanqingzi");             //invoke the constructor above
    }
}