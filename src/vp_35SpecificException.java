import java.util.Scanner;


public class vp_35SpecificException {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 6;
        marks[1] = 2;
        marks[2] = 8;

        Scanner sc = new Scanner(System.in);


        boolean flag = true;

        while(flag = true){
            System.out.println("enter the array index");
            int ind = sc.nextInt();

            System.out.println("enter the number wanted to divided by:");
            int number = sc.nextInt();
            try{
                System.out.println("the value at entered index is "+ marks[ind]);
                System.out.println("the answer after dividing the value in array with number is " + marks[ind]/number);
                flag = false;
                break;
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException is occurred ");
                System.out.println(e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException is occurred ");
                System.out.println(e);
            }catch(Exception e){
                System.out.println("Something occurred ");
            }


        }


    }
}
