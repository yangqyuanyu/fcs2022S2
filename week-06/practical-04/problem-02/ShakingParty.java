//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Number:4
//===================================


import java.util.*;
public class ShakingParty{
    private int nPeople;
    Random r=new Random();

    public ShakingParty(){
        this.nPeople=r.nextInt();   //no-arg constructor
    }

    public ShakingParty(int nTmp){
        setNumber(nTmp);
        System.out.println("So, there are "+nTmp+" people");               //to decide the num of people in the party
    }


    public void setNumber(int nPeople){     //setter
        this.nPeople=nPeople;
    }

    public int getNumber(){
        return nPeople;               //getter
    }

    public static int countHandShakes(int nPeople){
        if(nPeople==0||nPeople==1){
            return 0;
        }else if(nPeople==2){
            return 1;
        }else{
            return countHandShakes(nPeople-1)*nPeople/(nPeople-2);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("How many people?");
            int number=sc.nextInt();
            ShakingParty sp=new ShakingParty(number);
            System.out.println("The number of hand shakes: "+countHandShakes(sp.getNumber()));              //reference is required to call getter even if it's in the same class
        }while (true);                                                                                      //cuz getter isn't static

    }
}
