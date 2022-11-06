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

class Demo extends HanoiTower{
    public static void main(String[] args) throws Exception{
        int k;
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name source pole: ");
        String a=rd.readLine();
        System.out.println("Name auxiliary pole: ");
        String b=rd.readLine();
        System.out.println("Name destination pole: ");
        String c=rd.readLine();
        System.out.println("How many disks are there?");

        do{
            try
            {
                k= Integer.parseInt(rd.readLine());            //must declare 'k' outside
                break;                                         //try-catch exception
            }
            catch(Exception e) {
                System.out.println(e);
                System.out.println("Input again please:");
            }
        }while(true);

        new HanoiTower(k,a,b,c);
    }
}
