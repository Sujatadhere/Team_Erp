
    import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); 
        System.out.println("HashSet: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);
        System.out.println("Traversing HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


