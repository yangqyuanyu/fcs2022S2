import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Exception;

public class Main{

    public static boolean bracketsMatching(String input){
        char[] array = input.toCharArray();               //toCharArray()
        Stack<Character> stack= new Stack<Character>();        //Stack class
        for (int i = 0; i < array.length; i++) {
            // char x = input.charAt(i);


            if (array[i] == '(' ||array[i] == '[' || array[i] == '{') {
                // Push the element in the stack
                stack.push(array[i]);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.

            char kan;
            switch (array[i]) {
            case ')':
                kan = stack.pop();
                if (kan == '{' || kan == '[')
                    return false;
                break;

            case '}':
                kan = stack.pop();
                if (kan == '(' || kan == '[')
                    return false;
                break;

            case ']':
                kan = stack.pop();
                if (kan == '(' || kan == '{')
                    return false;
                break;
            }
        }

        return (stack.isEmpty());
    }

    // public static MyQueue reverseQueue(MyQueue queue){
    //     if(queue.isEmpty()){
    //         return queue;
    //     }

    //     Node node=queue.peek();
    //     queue.dequeue();
    //     queue=reverseQueue(queue);     //recursion method
    //     queue.enqueue(node);
    //     return queue;
    // }


    public static void reverseQueue(Queue<Integer> queue){
        int n=queue.size();
        Stack<Integer> stack=new Stack<>();

        // pushing
        for(int i=0;i<n;i++){
            int temp=queue.poll();
            stack.push(temp);
        }

        //Removing
        for(int i=0;i<n;++i){
            int temp=stack.pop();
            queue.add(temp);
        }

        //printing
        for(Integer element: queue){                   //Java 8 new feature
            System.out.println(element+" ");
        }
    }


    public static void main(String[] args) throws Exception{    //lang.Exception
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));     // IO stream

        try{
            System.out.println("Input a string: ");
            String input=rd.readLine();
            System.out.println(bracketsMatching(input));
        }catch(Exception e){
            System.out.println(false);
        }



        Queue<Integer> ob1=new LinkedList<>();
        ob1.add(1);
        ob1.add(9);
        ob1.add(8);
        ob1.add(9);


        reverseQueue(ob1);    //reverse the queue


    }

}

