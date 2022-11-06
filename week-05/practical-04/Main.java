import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.text.*;
public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        Player player=new Player();
        Human human=new Human();
        Computer computer=new Computer();                                  //create a couple of objects

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        System.out.println("The contest on "+ft.format(dNow)+" starts");  //current time



        System.out.println("Human, input here: ");
        String content = rd.readLine();                                  //Let human input !  Here I/O is adopted


        String patternString1 = ".*Rock.*";
        Pattern pattern1 = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(content);
        boolean isMatched1 = matcher1.matches();
        while(isMatched1==true){
            human.setHinput("Rock");
            break;                                       //check out whether human's input is Rock   Here Regex is used
        }

        String patternString2 = ".*Scissors.*";
        Pattern pattern2 = Pattern.compile(patternString2, Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(content);
        boolean isMatched2 = matcher2.matches();
        while(isMatched2==true){
            human.setHinput("Scissors");
            break;                               // check out whether human's input is Scissors      Here Regex is used
        }

        String patternString3 = ".*Paper.*";
        Pattern pattern3 = Pattern.compile(patternString3, Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(content);
        boolean isMatched3 = matcher3.matches();
        while(isMatched3==true){
            human.setHinput("Paper");
            break;                                     //check out whether human's input is Paper       Here Regex is used
        }

        if(isMatched1==false&&isMatched2==false&&isMatched2==false){
            System.out.println("That's an invalid input. So the winner is computer.See you ~~~");
            System.exit(0);
        }



        System.out.println("Human's choice is "+human.performMove());    //call a method in Class human, for confirmation.




        System.out.println("Now, it's computer's turn ");
        int option=r.nextInt(3);                   // And the computer is gonna spray out a choice randomly
        switch(option){
            case 0:
                computer.setCinput("Rock");
                break;
            case 1:
                computer.setCinput("Scissors");
                break;
            case 2:
                computer.setCinput("Paper");
                break;
        }

        System.out.println("Compuetr's choice is "+computer.performMove());     //call a method in Class computer, for confirmation.


        Referee referee=new Referee(computer.getCinput(),human.getHinput());
         //referee's constructor is invoked
        referee.whowins(computer.getCinput(),human.getHinput());
         //Let's see who wins in the end


    }
}
