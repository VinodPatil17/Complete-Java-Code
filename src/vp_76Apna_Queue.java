import java.util.LinkedList;
import java.util.Queue;

//SIMPLE QUEUE INITIATION USING INBUILD ADD REMOVE AND PEEK

public class vp_76Apna_Queue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(1);
        q.add(1);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}