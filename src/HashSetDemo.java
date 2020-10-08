import java.util.HashSet;
import java.util.Collections;

public class HashSetDemo {
    public static void main(String arrgs[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("King");
        hs.add("Queen");
        hs.add("Jack");
        hs.add("Ten");
        hs.add("Ace");
        hs.add("Queen");
        System.out.println(hs);
        hs.contains("Ace");
        hs.remove("Ten");
        System.out.println("Updated list");
        System.out.println(hs);
    }
}
