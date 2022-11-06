
public class Animal{
    private String name,favoriteFood;
    private int age;
    private double weight;




    public Animal(){
        System.out.println("no-arg construtor");
    }

    public void setName(String name){
        this.name=name;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood=favoriteFood;
    }
    public void setAge(int age){                                          //setter
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }



    public String getName(){
        return name;
    }
    public String getFavoriteFood(){                                 //getter
        return favoriteFood;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }


}

