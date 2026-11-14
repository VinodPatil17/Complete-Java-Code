public class vp_58Apna_subsequence {

    //VERY IMPORTANT
    //SUBSEQUENCE PROBLEM
    public static void subsequence(String str, String newString, int idx){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequence(str,newString+currChar, idx+1);
        subsequence(str,newString, idx+1);
    }
    public static void main(String[] args){
        String str = "abc";
        subsequence(str,"", 0);
    }
}