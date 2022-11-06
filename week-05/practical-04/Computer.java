class Computer extends Player{
    public Computer(){
    }

    @Override
    String performMove(){                 //override the method from parent class
        String result=getCinput();
        return result;
    }

}