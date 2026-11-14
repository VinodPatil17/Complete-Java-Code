
//different types of method in thread 

class Thr2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("manglore");

            //Thread.sleep it waits and according to time interval it execute the code
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}

class Thr3 extends Thread{
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("Surkod");
            i++;
        }
    }
}

public class vp_33DiffMethodInThread {
    public static void main(String[] args){
        Thr2 t1 = new Thr2();
        Thr3 t2 = new Thr3();

        //t1.join allows to complete execution of t1 until t2 waits for execution
        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}