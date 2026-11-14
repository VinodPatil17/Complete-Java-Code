public class vp_61Apna_XpowN {
    //PRINT X^N USING (STACK HEIGHT N )IN RECURSION
    public static int calPower(int n, int x){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int sigma = calPower(n-1, x);
        int alpha = x * sigma;
        return alpha;
    }
    public static void main(String[] args){
        int n = 5, x =2 ;
        int ans = calPower(n, x);
        System.out.println(ans);
    }
}