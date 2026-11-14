public class vp_48Apna_fiboonchiRecursion{

    //FIBNOOCHI USING RECURSION
    public static void fib(int A, int B, int n){
        if(n == 0){
            return;
        }
        int C = A + B;
        System.out.println(C);
        fib(B, C, n-1);
    }
    public static void main(String[] args){
        int A = 0;
        int B = 1;
        int n = 10;
        System.out.println(A);
        System.out.println(B);
        fib(A,B,n-2);
    }
}