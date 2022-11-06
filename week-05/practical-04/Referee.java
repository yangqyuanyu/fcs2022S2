class Referee extends Player{

    public Referee(String cinput,String hinput){
        super(cinput,hinput);
        System.out.println("Parameterized constructor of Referee is invoked. Let's see....");
    }

    void whowins(String cinput, String hinput){        //create a method to see who wins
        switch(hinput){
            case "Rock":
                if(cinput=="Scissors"){
                    System.out.println("Human wins");
                }else if(cinput=="Paper"){
                    System.out.println("Computer wins");
                }else{
                    System.out.println("The game ended in a draw");
                }
                break;
            case "Scissors":
                if(cinput=="Rock"){
                    System.out.println("Computer wins");
                }else if(cinput=="Paper"){
                    System.out.println("Human wins");
                }else{
                    System.out.println("The game ended in a draw");
                }
                break;
            case "Paper":
                if(cinput=="Scissors"){
                    System.out.println("Computer wins");
                }else if(cinput=="Rock"){
                    System.out.println("Human wins");
                }else{
                    System.out.println("The game ended in a draw");
                }
                break;
        }
    }

}