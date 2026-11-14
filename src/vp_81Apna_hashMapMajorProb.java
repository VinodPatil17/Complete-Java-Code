import java.util.*;
public class vp_81Apna_hashMapMajorProb{
    public static void majorityElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = arr.length;

        for(int i = 0; i < length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > length/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4,1,4,1,3,1};
        majorityElement(arr);
    }
}
