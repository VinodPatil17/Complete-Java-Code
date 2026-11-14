import java.util.*;

//LEETCODE PROBLEM
//PROBLEM NUMBER 12 CONVERTING INTEGER TO ROMAN
public class vp_54leetCode_problem{
    public static void intToRoman(int num){
        String newStr = "";
        String convert = String.valueOf(Math.abs(num));
        int length = convert.length();
        for(int i = 0; i < length; i++){
            char currChar = convert.charAt(i);
            int digit = currChar - '0';
            int power = (int) Math.pow(10, length-1-i);

            switch(power){
                case 1000:
                    newStr += repeat("M","" ,"",digit) ;
                    break;


                case 100:
                    newStr += repeat("C","D" ,"M",digit);
                    break;


                case 10:
                    newStr += repeat("X","L" ,"C",digit);
                    break;

                case 1:
                    newStr += repeat("I","V" ,"X",digit);
                    break;

            }

        }
        System.out.println(newStr);

    }

    public static String repeat(String ones, String five, String tens, int digit){
        switch(digit){
            case 0 : return"";
            case 1 : return ones;
            case 2 : return ones + ones;
            case 3 : return ones + ones + ones;
            case 4 : return ones + five;
            case 5 : return five;
            case 6 : return five + ones;
            case 7 : return five + ones + ones;
            case 8 : return five + ones + ones + ones;
            case 9 : return ones + tens;
            default : return "";
        }
    }
    public static void main(String[] args){
        int nums = 1000;
        intToRoman(nums);
    }
}
