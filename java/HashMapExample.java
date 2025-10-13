
    import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        map.put(104, "David");
        map.put(102, "Eve"); 
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 103: " + map.get(103));
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'David'? " + map.containsValue("David"));
        map.remove(104);
        System.out.println("After removing key 104: " + map);
        System.out.println("Traversing HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

    

