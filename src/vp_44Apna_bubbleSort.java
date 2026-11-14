
public class vp_44Apna_bubbleSort {
    public static void bubbleSort(int lol[]){
        for(int i = 0; i < lol.length; i++){
            System.out.print(lol[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int [] lol = {7,8,3,2,1};

        //BUBBLE SORT
        for(int i = 0; i < lol.length -1; i++){
            for(int j = 0; j < lol.length-i-1; j++){
                if(lol[j] > lol[j+1]){
                    int temp = lol[j];
                    lol[j] = lol[j+1];
                    lol[j+1] = temp;
                }
            }
        }
        bubbleSort(lol);
    }
}