package com.company;

public class vp_09Practiceprob{
    public static void main(String[] args){

        // reverse star
//        int n = 5;
//        for(int i = n; i > 0; i--){
//            for(int j = 0; j < i; j++ ){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        // adding even numbers
//        int n = 5;
//        int sum = 0;
//        for(int i = 0; i<n; i++){
//           sum = sum + (2*i)
//            System.out.println(sum);
//        }

        // 12 tables
//        int n = 12;
//        int multi = 1;
//        for(int i = 1; i <= 10; i++){
//            multi = n * i;
//            System.out.println(multi);
//        }

        //reverse 12 tables
//        int n = 12;
//        int multi = 1;
//        for(int i = 10; i > 0; i--){
//            multi = n * i;
//            System.out.println(multi);
//        }

        // Factorial problem
//        int n =5;
//        int factorial = 1;
//        for(int i = 1; i <=n; i++){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);

//        int n = 5;
//        int fact = 1;
//        int i = 1;
//        while(i <= n){
//            fact = fact * i;
//            i++;
//        }
//        System.out.println(fact);

//        int n = 8;
//        int multi = 1;
//        int sum = 0;
//
//        for(int i = 1; i <= 10; i++){
//            multi = 8 * i;
//            System.out.println(multi);
//            sum += multi;
//        }
//        System.out.println(sum);

        int n = 5;
        int i = n;

        while(i > 0){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;

        }

    }
}