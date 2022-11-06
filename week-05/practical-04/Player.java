public class Player{                            //base class
    private String hinput,cinput;
    public Player(){
    }
    public Player(String cinput,String hinput){
        this.cinput=cinput;
        this.hinput=hinput;
    }

    public void setHinput(String hinput){
        this.hinput=hinput;
    }
    public String getHinput(){
        return hinput;
    }
    public void setCinput(String cinput){
        this.cinput=cinput;
    }
    public String getCinput(){
        return cinput;
    }

    String performMove(){
        String result="阚清子女神";
        return result;
    }                                       // method performMove()
}
