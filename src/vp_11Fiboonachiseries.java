public class vp_11Fiboonachiseries {
    public static void main(String[] args){
        int init = 0;
        int sec = 1;
        int result;

        for(int i = sec; i < 10; i++){
            System.out.println(init);
            result = init + sec;
            //System.out.println(result);
            init = sec;
            sec = result;
        }

    }
}
