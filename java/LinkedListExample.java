
    import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);
        animals.addFirst("Elephant");
        animals.addLast("Tiger");
        System.out.println("After adding first & last: " + animals);
        animals.remove("Cat");
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removals: " + animals);
        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());
        System.out.println("Traversing LinkedList:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}

    

