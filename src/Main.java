import java.util.*;
public class Main{
    public static String getRev(HashMap<String, String> findStart){
        HashMap<String, String> revTrip = new HashMap<>();

        for(String key : findStart.keySet()){
            revTrip.put(findStart.get(key), key);
        }
        for(String key : findStart.keySet()){
            if(!revTrip.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> Trip = new HashMap<>();
        Trip.put("Chennai" , "Bengaluru");
        Trip.put("Mumbai" , "Delhi");
        Trip.put("Delhi" , "Goa");
        Trip.put("Goa" , "Hubli");
        Trip.put("Hubli" , "Chennai");

        String start = getRev(Trip);
        while(Trip.containsKey(start)){
            System.out.print(start + "-->");
            start = Trip.get(start);
        }
        System.out.println(start);
    }
}