class person1{
    int a;
    public int vinod(){
        return 5;
    }

    public void meth2(){
        System.out.println("Im method 2 of class person1");
    }
}

class person2 extends person1{
    public void meth1(){
        System.out.println("Im method 1 of class person2");
    }

    //same name method can be used we can override
    @Override
    public void meth2(){
        System.out.println("Im method 2 of class person2");
    }
}

public class vp_20MethodOverride {
    public static void main(String[] args){
        //call meth2 of class 1
        //person1 A = new person1();
        //A.meth2();

        //cals meth1 of class 2
        person2 B = new person2();
        B.meth1();
        //we can access class 1 method also from extends
        B.meth2();
    }
}