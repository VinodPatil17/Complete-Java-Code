
//setting priority to the thread

class Thr1 extends Thread{
    public Thr1(String name ){
        super(name);
    }

    public void run(){
        while(true){
            System.out.println("Thankyou" + this.getName());
        }
    }
}

public class vp_32PriorityThread {
    public static void main(String[] args){
        Thr1 t1 = new Thr1("Vinod");
        Thr1 t2 = new Thr1("karthik");
        Thr1 t3 = new Thr1("vignesh");
        Thr1 t4 = new Thr1("arjun");
        Thr1 t5 = new Thr1("manu");
        Thr1 t6 = new Thr1("nitesh");

        //Max priority, normal priority, min priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
