public class vp_12Patternprob {
    static void pattern(int x){
        //int sum = 0;
        for(int i = 1; i <= x; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

//    static void revpattern(int x){
//        for(int i = x; i >= 1; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
    public static void main(String[] args){
        pattern(5);
        //revpattern(5);
    }
}
