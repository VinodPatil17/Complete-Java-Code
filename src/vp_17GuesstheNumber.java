package com.company;
import java.util.Scanner;
import java.util.Random;

class Ran{
    Random random = new Random();
    private int target = random.nextInt(100)+1;

    public boolean find(int User){
        if(target > User){
            System.out.println("UP");
            return false;
        } else if (target < User) {
            System.out.println("DOWN");
            return false;
        }else{
            System.out.println("You GOT IT");
            return true;
        }

    }

}
public class vp_17GuesstheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ran game = new Ran();

        boolean correct = false;
        while(!correct){
            System.out.println("guess the number :");
            int User = sc.nextInt();
            correct = game.find(User);
        }
        sc.close();
    }
}