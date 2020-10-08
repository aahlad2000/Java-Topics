import java.util.HashMap;
import java.util.Collections;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Aahlad");
        hm.put(2,"Anurag");
        hm.put(3,"Vijay");
        hm.put(4,"Sandeep");
        System.out.println("Before");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get(1));
        hm.remove(2);
        System.out.println("Updated List");
        System.out.println(hm);
    }
}
