public class problem{
    public static void main(String[] args){
        System.out.println("This is the last line of the code!");
        int ths=25;




        for(int i=0;i<10;i++){
            for(int j=i;j<10;j++){
                for(int k=j;k<10;k++){
                    int value=i*j*k;
                    if(value !=0){
                        if(value %ths==0){
                            System.out.print("i: " + i);
                            System.out.print(" j: " + j);
                            System.out.println(" k: " + k + " - value " + value);
                        }
                    }
                }
            }
        }





        System.out.println("This is the first line of the code!");
    }
}