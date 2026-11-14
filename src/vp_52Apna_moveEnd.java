public class vp_52Apna_moveEnd {

    //MOVE ALL X TO THE END OF THE STRING
    public static void moveEnd(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveEnd(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveEnd(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args){
        String str = "axbcxdxx";
        moveEnd(str, 0, 0, "");
    }
}