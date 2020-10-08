
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        System.out.println("List of all the digits");
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List of all the digits");
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println("Sorted List of all the digits after removal");
        System.out.println(numbers);
        int a = numbers.size();
        System.out.println("Size of the ArrayList");
        System.out.println(a);
        //numbers.clear();
    }
}
