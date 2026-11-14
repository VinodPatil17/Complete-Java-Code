// Important Topic 

//in Java we cant inherit from 1 or more parent class to child class 
//soo java developed interface which allows 1 or more child interface implement to class
//also it allows 1 extend class in java 

interface Bicycle {
    void Speedup(int increment);
    void Slowdown(int decrement);
}
interface moterCycle{
    void Accelerator(int increment);
    void Stop(int decrement);
}

//can implement more than one interfaces to class in java
class Hero implements Bicycle , moterCycle{

    void hello(){
        System.out.println("hello world");
    }
    //in interface all method should be applied or used otherwise it will throw error 
    public void Speedup(int increment){
        System.out.println("padleing...");
    }
    public void Slowdown(int decrement){
        System.out.println("Break...");
    }

    public void Accelerator(int increment){
        System.out.println("speed...");
    }

    public void Stop(int decrement){
        System.out.println("stop...");
    }
}

public class vp_24Interface {
    static void main(String[] args){
        //interfaces cannot turn into objects
        //bicycle be = new bicycle(); --> Throw error

        Hero cycle = new Hero();
        cycle.hello();
        cycle.Speedup(5);

        cycle.Accelerator(5);
        cycle.Stop(5);
    }
}