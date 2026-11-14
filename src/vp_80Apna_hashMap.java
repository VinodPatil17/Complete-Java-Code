//hashmap is used when we want to store pair values
//key and value
//key should be unique value can be change
import java.util.*;
public class vp_80Apna_hashMap{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //INSERTION
        //(KEY, VALUE)
        map.put("India", 120);
        map.put("US", 34);
        map.put("Japan", 22);

        //TO PRINT ALL KEYS AND VALUES RESPECTIVELY
        System.out.println(map);

        //TO UPDATE THE VALUE REINSERT
        map.put("India", 100);
        System.out.println(map);

        //SEARCH FOR KEY
        if(map.containsKey("china")){
            System.out.println("hashmap contains the china key");
        }else{
            System.out.println("it does not contain the key");
        }

        System.out.println(map.get("India"));//returns the value
        System.out.println(map.get("Korea"));//if not present returns null

        //for hashmap iteration we use like of foreach loop
        //for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //storing in set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
        //REMOVE THE PAIR
        map.remove("china");
        System.out.println(map);
    }
}