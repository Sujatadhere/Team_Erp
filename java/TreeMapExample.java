
    import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(105, "Alice");
        map.put(101, "Bob");
        map.put(104, "Charlie");
        map.put(102, "David");
        map.put(103, "Eve");
        System.out.println("TreeMap: " + map);
        System.out.println("Value for key 104: " + map.get(104));
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("HeadMap (<104): " + map.headMap(104));
        System.out.println("TailMap (>=104): " + map.tailMap(104));
        map.remove(102);
        System.out.println("After removing key 102: " + map);
        System.out.println("Traversing TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


