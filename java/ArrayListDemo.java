import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("ArrayList Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        list.remove("Banana");
        System.out.println("After removal: " + list);
    }
}
