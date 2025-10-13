
    import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20); 
        System.out.println("TreeSet: " + numbers);
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        System.out.println("HeadSet (<30): " + numbers.headSet(30));
        System.out.println("TailSet (>=30): " + numbers.tailSet(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Lower than 30: " + numbers.lower(30));
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);
        System.out.println("Traversing TreeSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

    

