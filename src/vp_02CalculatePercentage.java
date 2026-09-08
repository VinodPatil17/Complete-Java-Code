package com.company;
import java.util.Scanner;

public class vp_02CalculatePercentage {
    public static void main(String[] args){
        System.out.println("Enter the Marks according to the subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks obtained in Kannada:");
        int A = sc.nextInt();
        System.out.println("Marks obtained in English:");
        int B = sc.nextInt();
        System.out.println("Marks obtained in Hindi:");
        int C = sc.nextInt();
        System.out.println("Marks obtained in Maths:");
        int D = sc.nextInt();
        System.out.println("Marks obtained in Science:");
        int E = sc.nextInt();
        System.out.println("Marks obtained in Social:");
        int F = sc.nextInt();

        int sum = A+B+C+D+E+F;
        System.out.println(sum);
        int Total = 600;

        int percentage = (sum * 100)/ 600;

        System.out.println("The total percentage is "+percentage+"%");
        System.out.println();
    }
}