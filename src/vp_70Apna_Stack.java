import java.util.Stack;
//USING INBUILD STACK METHOD TO PUSH, POP, PEEK
//EASIEST WAY TO BUILD STACK
public class vp_70Apna_Stack{
    public static void main(String[] args){
        Stack<Integer> s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
