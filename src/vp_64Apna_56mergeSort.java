public class vp_64Apna_56mergeSort {

    //IMPORTANT
    //MERGE SORT
    public static void conquer(int arr[], int st, int mid, int ed){
        int[] merge = new int[ed - st +1];
        int idx1 = st;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ed){
            if(arr[idx1] < arr[idx2]){
                merge[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1 <= mid){
            merge[x] = arr[idx1];
            idx1++;
        }

        while(idx2 <= ed){
            merge[x] = arr[idx2];
            idx2++;
        }

        for(int i =0, j = st; i<merge.length; i++ , j++){
            arr[j] = merge[i];
        }
    }

    public static void divide(int arr[],int st, int ed){
        if(st >= ed){
            return;
        }
        int mid = st + (ed - st) / 2;
        divide(arr, st, mid);
        divide(arr, mid+1, ed);
        conquer(arr, st, mid, ed);
    }
    public static void main(String[] args){
        int[] arr = {5,3,7,8,2,6,};
        int n = arr.length;
        divide(arr, 0 , n-1);

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}