import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("Horse");
        vector.add("Dog"); 
        System.out.println("Vector: " + vector);
        System.out.println("Element at index 2: " + vector.get(2));
        vector.remove("Cat");
        System.out.println("After removing 'Cat': " + vector);
        System.out.println("Size of vector: " + vector.size());
        System.out.println("Traversing Vector:");
        for (String animal : vector) {
            System.out.println(animal);
        }
    }
}
