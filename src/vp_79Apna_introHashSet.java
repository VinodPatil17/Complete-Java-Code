import java.util.HashSet;
import java.util.Iterator;
public class vp_79Apna_introHashSet{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        //Insert value or adding
        //it not hold any duplicates
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search for value - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(5)){
            System.out.println("not contains");
        }

        //DELETE THE VALUE FROM SET
        set.remove(1);
        if(set.contains(1)){
            System.out.println("contains 1");
        }else{
            System.out.println("not contains");
        }

        //SIZE OF THE HASHSET
        System.out.println("the size of the set " + set.size());

        //IMPORTANT
        //TO PRINT ALL ELEMENTS IN THE HASHSET
        System.out.println(set);

        //ITERATOR
        //in hashset it dont have index
        //in this we use .next to go for next element
        //.hasNext is used for weather the next element is present or not it returns true or false
        // it dont have order it can return the value in any order
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}