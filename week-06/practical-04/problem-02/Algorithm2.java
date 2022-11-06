//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Number:4
//===================================


import java.util.*;
public class Algorithm2{
    private int nPeople;
    Random r=new Random();

    public Algorithm2(){
        this.nPeople=r.nextInt();   //no-arg constructor
    }

    public Algorithm2(int nTmp){
        setNumber(nTmp);
        System.out.println("So, there are "+nTmp+" people");               //to decide the num of people in the party
    }


    public void setNumber(int nPeople){     //setter
        this.nPeople=nPeople;
    }

    public int getNumber(){
        return nPeople;               //getter
    }

    public static int factorial(int adi){
        if(adi==0||adi==1){
            return 1;
        }else{                                     // method factorial
            return factorial(adi-1)*adi;
        }
    }

    static int countHandShakes(int nPeople){
            return factorial(nPeople)/(2*factorial(nPeople-2));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("How many people?");
            int number=sc.nextInt();
            Algorithm2 al=new Algorithm2(number);
            if(number==0||number==1){
                System.out.println("The number of hand shakes: 0");
            }else if(number==2){
                System.out.println("The number of hand shakes: 1");
            }else{
                System.out.println("The number of hand shakes: "+countHandShakes(al.getNumber()));
            }
        }while (true);

    }
}
