
    import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Position of B (from top): " + stack.search("B"));
        System.out.println("Traversing Stack:");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}

