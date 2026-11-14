class Thr extends Thread{

    //constructor of thread and it takes input from parameter
    public Thr(String name){
        super(name);
    }

    public void run(){
        System.out.println("my name is hello");
    }
}

public class vp_31ConstructorThread {
    public static void main(String[] args){
        //creating object and passing name parameter
        Thr t1 = new Thr("vinod");
        Thr t2 = new Thr("Karthik");
        //running threads
        t1.start();
        t2.start();

        //getting the thread name and ids 
        System.out.println("the Id of the thread is " + t1.getId());
        System.out.println("the name of the thread is " + t1.getName());
        System.out.println("the Id of the thread is " + t2.getId());
        System.out.println("the name of the thread is " + t2.getName());
    }
}