public class Person{
    private String name;
    private int age;

    //default constructor
    public Person(){
        this.name="anon";
        this.age=0;
    }
    //parameterized constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    //getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Person: "+getName()+" is age: "+getAge();
    }

}