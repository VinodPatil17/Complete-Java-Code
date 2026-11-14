public class vp_53Apna_permutation {

    //PERMUTATION USING RECURSION
    public static void permutation(String str, String newStr){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        for(int i =0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String lala = str.substring(0, i) + str.substring(i+1);
            permutation(lala, currChar+newStr);
        }
    }
    public static void main(String[] args){
        String str = "ABC";
        permutation(str, "");
    }
}