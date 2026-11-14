public class vp_41Apna_reverseString {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Vinod");

        for(int i = 0; i < str.length()/2; i++){
            int front = i;
            int last = str.length() -1 -i;

            char frontChar = str.charAt(front);
            char lastChar = str.charAt(last);

            str.setCharAt(front, lastChar);
            str.setCharAt(last, frontChar);
        }
        System.out.println(str);
    }
}