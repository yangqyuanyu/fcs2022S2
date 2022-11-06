class Human extends Player{
    public Human(){
    }

    @Override
    String performMove(){              //override the method from parent class
        String result=getHinput();
        return result;
    }
}