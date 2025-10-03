import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai"); 
        System.out.println("LinkedHashSet: " + cities);
        System.out.println("Contains Delhi? " + cities.contains("Delhi"));
        System.out.println("Contains Chennai? " + cities.contains("Chennai"));
        cities.remove("Bangalore");
        System.out.println("After removing Bangalore: " + cities);
        System.out.println("Traversing LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
