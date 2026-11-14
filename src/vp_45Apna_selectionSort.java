public class vp_45Apna_selectionSort{
    public static void selectionSort(int lol[]){
        for(int i = 0; i < lol.length; i++){
            System.out.print(lol[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] lol = {7,5,3,9,1};

        //SELECTION SORT
        for(int i = 0; i < lol.length-1; i++){
            int smallest = i;
            for(int j = i+1; j < lol.length; j++){
                if(lol[smallest] > lol[j]){
                    int temp = lol[smallest];
                    lol[smallest] = lol[j];
                    lol[j] = temp;
                }
            }
        }
        selectionSort(lol);
    }
}