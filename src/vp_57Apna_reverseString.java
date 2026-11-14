
public class vp_57Apna_reverseString {

    //REVERSE STRING USING RECURSION
    public static void reverseString(String name, int idx){
        if(idx == 0){
            System.out.println(name.charAt(0));
            return;
        }
        System.out.println(idx);
        reverseString(name, idx-1);
    }
    public static void main(String[] args){
        String name = "Vinod Patil";
        reverseString(name, name.length()-1);
    }
}