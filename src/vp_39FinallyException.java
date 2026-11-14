public class vp_39FinallyException {
    public static int greet(){
        try{
            int a = 6;
            int b = 0;
            int result = a /b;
            return result;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally will execute even after you return or exit ");
        }
        return 0;
    }
    public static void main(String[] args){
        int k = greet();
        System.out.println(k);

        //second example
        int x = 7;
        int y  = 9;
        while(true){
            try{
                System.out.println(x/y);
            }catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("im the fianlly value for y :" + y);
                System.out.println("even tho after written break the finally code will execute");
            }
             y--;
        }
    }
}
