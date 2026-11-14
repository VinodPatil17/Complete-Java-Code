abstract class Parent{
    public Parent(){
        System.out.println("It is Parent class constructor");
    }

    public void hello(){
        System.out.println("Hello Guys");
    }

    abstract public void greet();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("child class Abstraction");
    }
}

abstract class child2 extends Parent{
    public void namaskar(){
        System.out.println("Namaskar lee bolle maganna");
    }
}

public class vp_23Abstraction {
    static void main(String[] args) {
        //you cant create an object of abstract class
        //Parent pp = new Parent(); --> throw error

        //Only object is created by extended class of Abstraction class
        child chill = new child();
        chill.greet();

        //Even object is not created for extended Abstraction class
        //child2 chilld = new child2(); --> Error
    }
}
