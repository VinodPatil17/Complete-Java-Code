public class vp_47Apna_pracQues{

    //SUM OF N NATURAL NUMBERS USING RECURSION

//    public static void sumNatural(int n, int i,int sum){
//        if(i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        sumNatural(n, i+1, sum);
//
//    }
//    public static void main(String[] args){
//        sumNatural(10, 1, 0);
//    }


    //FACTORIAL PROBLEM USING RECURSION
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int calculate = factorial(n-1);
        int result = n * calculate;
        return result;
    }
    public static void main(String[] args){
        int ans = factorial(5);
        System.out.println(ans);
    }
}