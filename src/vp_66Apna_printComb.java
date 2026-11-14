public class vp_66Apna_printComb {
    public static String[] keyBoard = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    //KAYBOARD COMBINATION USING RECURSION
    public static void printComb(String key,int idx,  String Combination){
        if(idx == key.length()){
            System.out.println(Combination);
            return;
        }
        char currChar = key.charAt(idx);
        String mapping = keyBoard[currChar - '0'];

        for(int i = 0; i < key.length(); i++){
            printComb(key, idx+1, Combination+mapping.charAt(i));

        }
    }
    public static void main(String[] args){
        String key = "23";
        printComb(key, 0, "");

    }
}