import java.util.HashSet;

//UNIQUE SUBSEQUENCE PROBLEM USING RECURSION
public class vp_60Apna_uniqSubsequence {
    public static void uniqSubsequence(String str,int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqSubsequence(str, idx+1, currChar+newString, set);
        uniqSubsequence(str, idx+1, newString, set);
    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqSubsequence(str,0,"", set);
    }
}
