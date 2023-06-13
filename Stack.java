//Program to understand Stack
import java.util.*;

public class Stack {
    static class StackClass{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static void pop(){
            if(isEmpty()){
                return ;
            }
            list.remove(list.size()-1);
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {

        StackClass.push(1);
        StackClass.push(2);
        StackClass.push(3);
        StackClass.push(4);

        while(!StackClass.isEmpty()){
            System.out.println(StackClass.peek());
            StackClass.pop();
        }
    }
}
