class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
 public class CustomExceptionExample {
    static void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
