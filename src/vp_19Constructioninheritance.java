class Base1{
    //constructor w/o parameter
    Base1(){
        System.out.println("I am Base1 Constructor");
    }

    //constructor with parameter
    Base1(int x){
        System.out.println("I am constructor with parameter" + x);
    }
}

class Mass extends Base1{
    Mass(){
        //super is used to pass parameter to Base1 constructor and if we want to call constructor with parameter (override)
        //super(1);
        System.out.println("I am Mass Constructor");
    }

    Mass(int x, int y){
        super(x);
        System.out.println("I am constructor with parameter" + x +" "+ y);
    }
}

public class vp_19Constructioninheritance {
    public static void main(String[] args){
        //Automatically Base1 and Mass constructor Calls
//      Base1 BB = new Base1();
//        Mass MM = new Mass();

        //if we call only Mass class it automatically calls Base1 constructor also
        //Mass MM  = new Mass();

        Mass mm = new Mass(13, 18);
    }
}