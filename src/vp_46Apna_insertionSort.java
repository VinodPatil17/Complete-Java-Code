public class vp_46Apna_insertionSort {
    public static void insertionSort(int lol[]){
        for(int i = 0; i < lol.length; i++){
            System.out.print(lol[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] lol = {7,5,3,9,1};

        //INSERTION SORT
        for(int i = 1; i < lol.length; i++){
            int current = lol[i];
            int j = i-1;
            while(j >= 0 && current < lol[j]){
                lol[j+1] = lol[j];
                j--;
            }
            lol[j+1] = current;
        }
        insertionSort(lol);
    }
}