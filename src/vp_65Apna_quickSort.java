public class vp_65Apna_quickSort {


    //QUICK SORT PROBLEM / ALGORITHM
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low,pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,4,2,8,9,3};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        for(int i =0 ; i< n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}