
class betaException extends Exception{
    public String toString(){

        return "Radius cannot be negative";
    }

    public String getMessage(){
        return "check before entering the number";
    }
}

public class vp_38ThrowsException {

    //in this throws warns before for developers or user
    public static double area(double r) throws betaException{
        if(r < 0) {
            throw new betaException();
        }
        double result = Math.PI * r *r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args){
//        try{
//            int c = divide(3,0);
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e);
//        }

        try{
            double d = area(-6);
            System.out.println(d);
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}