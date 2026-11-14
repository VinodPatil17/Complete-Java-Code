//this first type of thread initilization

class holy extends Thread{
    public void run(){
        int i = 0;
        while(i < 4000){
            System.out.println("hello vinod");
            i++;
        }
    }
}

class shit extends Thread{
    public void run(){
        int i = 0;
        while(i < 4000){
            System.out.println("nice guys");
            i++;
        }
    }
}

public class vp_29ThreadByExtending {
    public static void main(String[] args){
        holy t1 = new holy();
        shit t2 = new shit();

        t1.start();
        t2.start();
    }
}