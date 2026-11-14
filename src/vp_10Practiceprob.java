//package com.company;

import java.util.Arrays;
import java.util.Collections;

public class vp_10Practiceprob {
    public static void main(String[] args){
       /* float [] array = {15.0f, 20.0f,50.0f };
        float sum = 0;
        for(float ele:array){
            sum = sum + ele;
        }
        System.out.println(sum);
        */

        /*
        float [] array = {15.0f, 20.0f,50.0f };
        float num = 15.4f;
        boolean isArray =  false;
        for(float ele:array){
            if(ele == num){
                isArray = true;
            }
        }
        if(isArray){
            System.out.println("number");
        }else{
            System.out.println("no number");
        }
        */

        /*
        int [] marks = {12,23,21,55,33,66,88};
        int sum = 0;
        for(int ele:marks){
            sum = sum + ele;
        }
        int avg = sum / marks.length;
        System.out.println(avg);
        */

        /*
        int [][] mat1 = {{1,2,3},
                        {4,5,6}};

        int [][] mat2 = {{1,2,3},
                {4,5,6}};

        int [][] result = {{0,0,0},
                {0,0,0}};

        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        */


        int [] arr = {1,2,3,4,5};
        int j = arr.length -1;
        for(int i = 0; i <= arr.length /2; i ++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }
        // System.out.print(Arrays.toString(arr));
        System.out.print(arr);
    }
}