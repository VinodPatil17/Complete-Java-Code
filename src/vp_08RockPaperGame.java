package com.company;
import java.util.Scanner;
import java.util.Random;

public class vp_08RockPaperGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:");
        String User = sc.next();
        float value;

        Random rnd = new Random();
        int comp = rnd.nextInt(3)+1;
        String Choice = "";
        if(comp == 1){
            Choice = "scissor";
        }else if(comp == 2){
            Choice = "paper";
        }else {
            Choice = "stone";
        }

        System.out.println(Choice);

        if(User.equals("scissor") && Choice.equals("paper")){
            System.out.println("win");
        }else if(User.equals("scissor") && Choice.equals("stone")){
            System.out.println("lose");
        }else if(User.equals("paper") && Choice.equals("scissor")){
            System.out.println("lose");
        }else if(User.equals("paper") && Choice.equals("stone")){
            System.out.println("win");
        }else if(User.equals("stone") && Choice.equals("paper")){
            System.out.println("lose");
        }else if(User.equals("stone") && Choice.equals("scissor")){
            System.out.println("win");
        }else{
            System.out.println("Draw");
        }
    }
}