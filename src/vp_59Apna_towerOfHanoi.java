public class vp_59Apna_towerOfHanoi {
    public static void towerOfHanoi(int n, String src, String hlp, String dest){
        if(n ==1){
            System.out.println("transfer desk "+ n +" from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlp);
        System.out.println("transfer desk "+ n +" from " + src + " to " + dest);
        towerOfHanoi(n-1, hlp, src, dest);
    }
    public static void main(String[] args){
        int n = 3;
        towerOfHanoi(n, "Source", "Help", "Destination");
    }
}