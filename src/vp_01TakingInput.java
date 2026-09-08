package com.company;
import java.util.Scanner;

public class vp_01TakingInput {
    public static void main(String[] args){
        System.out.println("Taking Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");

        //Int
        //int A = sc.nextInt();

        //Float
        float A = sc.nextFloat();
        System.out.println("Enter the Second number ");
        //int B = sc.nextInt();
        float B = sc.nextFloat();
        //int sum =  A + B;
        float sum = A + B;
        System.out.println("The total sum of these two numbers is "+sum);

        // String
        String chat = sc.nextLine();
        System.out.println(chat);

        // use of hasnext
        boolean vinod = sc.hasNextInt();
        System.out.println(vinod);



    }
}
