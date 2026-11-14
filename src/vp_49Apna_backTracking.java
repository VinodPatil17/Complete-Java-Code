public class vp_49Apna_backTracking {

    //BACKTRACKING IMPORTANT
    public static void possible(String str, String newStr, int idx){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String nextChar = str.substring(0, i) + str.substring(i+1);
            possible(nextChar, newStr+currChar, idx+1);
        }
    }
    public static void main(String[] args){
        String str = "ABC";
        possible(str, "", 0);
    }
}