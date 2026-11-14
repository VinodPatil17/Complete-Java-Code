
//commonly occuring Exceptions in try and catch
//null pointer exception
//Arithmetic Exception
//Array Index out of bound Exception
//illegal Argument Exception
//number format Exception

public class vp_34TryCatch {
    public static void main(String[] args){
        int A = 6000;
        int B = 0;
        try{
            int  c = A/B;
            System.out.println("the result is :"+ c);
        }catch (Exception e){
            System.out.println("cannot divide 6000");
            System.out.println(e);
        }
    }
}
