package com.company;
import java.util.Scanner;

public class vp_06TaxProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income :");
        float input = sc.nextInt();

        if(input <= 250000){
            System.out.println("There is no tax for the " + input);

        }else if(input > 250000 && input <= 499999 ){
            float tax = 5/100f*input;
            System.out.println("the total tax for the " + input + "is :" + tax);

        }else if(input > 499999 && input <= 999999){
            float tax = 20/100f*input;
            System.out.println("the total tax for the " + input + "is :" + tax);
        }else if(input > 999999){
            float tax = 30/100f*input;
            System.out.println("the total tax for the " + input + "is :" + tax);
        }
    }
}
