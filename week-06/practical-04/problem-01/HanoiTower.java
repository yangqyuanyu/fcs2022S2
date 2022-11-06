//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Number:4
//===================================





import java.io.*;
import java.util.*;


public class HanoiTower{
    int num;

    public HanoiTower(){          //default constructor
        this.num=3;
    }

    public HanoiTower(int dTmp,String a,String b, String c){
        this.num=dTmp;
        System.out.println("The number of disks is set to be :"+num);     //parameterized constructor
        System.out.println("So, total number of moves required = "+(Math.pow(2,num)-1));      //bracket attention
        solve(num,a,b,c);
    }

    public void solve(int hyomin,String a,String b, String c){
        if(hyomin==1){
            System.out.println("Move the disk 1"+" from Pole "+a+" to Pole "+c);
        }else{
            solve(hyomin - 1,a,c,b);
            System.out.println("Move the disk "+hyomin+" from Pole "+a+" to Pole "+c);
            solve(hyomin - 1,b,a,c);
        }
    }
}


