import java.util.Scanner;
public class Book{
    String url;
    int shelf,aisle,floor;
    public Book(){
        System.out.println("parent constructor of no-arg is invoked");
    }

    public Book(String url,int shelf,int aisle,int floor){
        this.url=url;
        this.shelf=shelf;
        this.aisle=aisle;
        this.floor=floor;
        System.out.println("parent parameterized constructor is invoked");
    }


    public void setUrl(String url){
        this.url=url;
    }
    public void setShelf(int shelf){
        this.shelf=shelf;
    }
    public void setAisle(int aisle){                 //setters
        this.aisle=aisle;
    }
    public void setFloor(int floor){
        this.floor=floor;
    }

    public String getUrl(){
        return url;
    }
    public int getShelf(){      //getters
        return shelf;
    }
    public int getAisle(){
        return aisle;
    }
    public int getFloor(){
        return shelf;
    }

    void displayBookLocation(){
    }

}