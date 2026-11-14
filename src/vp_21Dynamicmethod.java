class phone{
    public void hello(){
        System.out.println("Hello guys");
    }
    public void on(){
        System.out.println("phone getting on...");
    }
}

class smartphone extends phone{

    public void namaskar(){
        System.out.println("namaskar");
    }
    public void on(){
        System.out.println("smartphone is getting on...");
    }
}

public class vp_21Dynamicmethod  {
    public static void main(String[] args){
        //in Dynamic method we created obj using smartphone
        //always use reference as super class and object from subclass. it won't work vise versa
        phone obj = new smartphone();
        //from this smartphone on method. it won't run phone on method
        //obj.on();

        //we can call method which is in superclass 
        obj.hello();

        //it won't run because it only when it has same name in superclass if it has different name it wont run in subclass
        //but it will sun super class method example is used in above
        //obj.namaskar();
    }
}