//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Number:4
//===================================
import java.util.*;
class ShakingPartyConstrainted extends ShakingParty{
    private int nCouples;
    Random r=new Random();
    public ShakingPartyConstrainted(){
        this.nCouples=r.nextInt();     //no-arg constructor
    }

    public ShakingPartyConstrainted(int nTmp){
        nCouples=nTmp;
        System.out.println("So, there are "+nTmp+" people");               //to decide the num of couples in the party
    }


    //override
    public int getNumber(){
        return nCouples;               //getter
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("How many couples?");
            int number=sc.nextInt();
            ShakingPartyConstrainted spc=new ShakingPartyConstrainted(number);
            System.out.println("The number of hand shakes: "+spc.countHandShakes(spc.getNumber())*2);
        }while (true);

    }
}
