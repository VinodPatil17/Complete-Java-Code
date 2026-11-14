public class vp_56Apna_removeDuplicate {

    //IMPORTANT
    //REMOVING DUPLICATES FROM STRING USING RECURSION
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, String newString, int idx){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str,newString, idx+1);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str,newString, idx+1);
        }
    }
    public static void main(String[] args){
        String str = "bacdkhdsfhskhgfhksjhfkfjgvbgkjdgsvbuj";
        removeDuplicate(str, "", 0);
    }
}