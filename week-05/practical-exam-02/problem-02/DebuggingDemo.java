//==================================
// Foundations of Computer Science
// Student: Yang Quanyu
// id: 1874869
// Semester:2
// Year:2022
// Practical Exam Number:2
//===================================

public class DebuggingDemo {

    public void bugMethod() {                              //the array length is 4.Thus the index number cannot be 5,for it begins with 0 actually
         int num[] = {1, 2, 3, 4};                         
         System.out.println(num[3]);
     }

    public int bugMethod2() {
            int ans = 0;                                                  //the data type of ans must be integer,which is defined at line 17
            System.out.println("Now this method does not have a bug!");
            return ans;
     }


}