package com.company;
import java.util.Scanner;
public class vp_05PracticeProb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3;
        System.out.println("Enter the marks of physics:");
        m1 = sc.nextInt();

        System.out.println("Enter the marks of Chemistry:");
        m2 = sc.nextInt();

        System.out.println("Enter the marks of Mathematics:");
        m3 = sc.nextInt();

        float Avg =  (m1+m2+m3)/3f;

        if(Avg > 40 && m1 > 33 && m2 > 33 && m3 > 33){
            System.out.println("The Student is passed exam with Average ");
        }else{
            System.out.println("The student is not passed with an Average ");
        }
    }
}