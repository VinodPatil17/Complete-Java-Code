import java.util.Scanner;
public class vp_43Apna_bitManipulation {
    public static void main(String[] args){
        //BIT MANIPULATION
        //GET BIT

//        int n = 5;
//        int pos = 3;
//
//        int bitMask = 1 << pos;
//
//        if((bitMask & n) == 0){
//            System.out.println("bit was 0");
//        }else{
//            System.out.println("bit was 1");
//        }

        //SET BIT

//        int n = 5;
//        int pos = 1;
//        int bitMask = 1 << pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

        //CLEAR

//        int n = 5;
//        int pos = 2;
//        int bitMask = 1 << pos;
//
//        int notBitMask = ~(bitMask);
//
//        int number  = notBitMask & n;
//        System.out.println(number);

        //UPDATE

        int n = 5;
        int pos = 2;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int bitMask = 1 << pos;

        if(input == 0){
            int upd = bitMask | n ;
            System.out.println(upd);
        }else{
            int notBitMask = ~(bitMask);
            int upd = notBitMask & n;
            System.out.println(upd);
        }
    }
}