import java.util.ArrayList;

//STACK USING ARRAYLIST
public class vp_69Apna_stackArraylst{
    class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return (list.size()-1);
        }
    }
    public static void main(String[] args){
        vp_68Apna_stackLinkedlst.Stack s = new vp_68Apna_stackLinkedlst.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}