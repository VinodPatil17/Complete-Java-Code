
import java.util.Scanner;

public class vp_36NestedException{
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 6;
        marks[1] = 2;
        marks[2] = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index number:");
        int ind = sc.nextInt();

        //when the level 2 exception worked then level one exception not work code will exits before
        try{
            System.out.println("this nested try level 1");

            try{
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException is occurred");
                System.out.println("level 2 exception");
            }
        } catch (Exception e) {
            System.out.println("some thing wrong");
            System.out.println("level 1 exception");
        }
    }
}