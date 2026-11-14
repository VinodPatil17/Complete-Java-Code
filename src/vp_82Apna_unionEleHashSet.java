import java.util.HashMap;
import java.util.HashSet;

public class vp_82Apna_unionEleHashSet{
    public static void unionElement(int[] arr1, int[]arr2){
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for(int i = 0; i < n1; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j < n2; j++){
            set.add(arr2[j]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }

    public static void interSectionEle(int[] arr1, int[] arr2){
        int count = 0;
        HashSet<Integer> intra = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            intra.add(arr1[i]);
        }

        for(int j = 0; j < arr2.length; j++){
            if(intra.contains(arr2[j])){
                count++;
                intra.remove(arr2[j]);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,4,3,5};
        int[] arr2 = {1,5,7,8,3,2,};
        unionElement(arr1, arr2);
        interSectionEle(arr1,arr2);
    }
}
