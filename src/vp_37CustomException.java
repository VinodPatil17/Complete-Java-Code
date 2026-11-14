
//this is custom Exception class creation and also one exception class can try to handle multiple exception and try class

import java.util.Scanner;
//sigma is custom exception class extends from Exception
class Sigma extends Exception{
    @Override
    //toString will returns a textual representation of an object
    public String toString() {
        return super.toString();
        //return "I am toString";
    }

    //it tells in shortly why error or exception occurres
    @Override
    public String getMessage() {
        return super.getMessage() ;
        //return "I am getMessage";
    }
}
public class vp_37CustomException {
    public static void main(String[] args){
        int a;
        Scanner sc  = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 10){
            try{
                throw new Sigma();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //it tells which class which line error happen
                e.printStackTrace();
            }
        }
    }
}
